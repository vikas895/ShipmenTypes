package in.nit.config;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableTransactionManagement
@EnableWebMvc
@PropertySource("classpath:application.properties")
@ComponentScan("in.nit")
public class AppConfig 
{
@Autowired
private Environment env;
//DataSource
	
	 @Bean 
	 public DataSource ds() {
       BasicDataSource d= new BasicDataSource();
	 d.setDriverClassName(env.getProperty("db.driver"));
	 d.setUrl(env.getProperty("db.url"));
	 d.setUsername(env.getProperty("db.user"));
	 d.setPassword(env.getProperty("db.password"));
	 return d;
	 }
	 //SessionFactory
	 @Bean
	 public LocalSessionFactoryBean sf() {
		LocalSessionFactoryBean s=new LocalSessionFactoryBean();
      s.setDataSource(ds());
      s.setHibernateProperties(props());
		//s.setAnnotatedClasses(ShipmentType.class);
      s.setPackagesToScan("in.nit.model");
		return s;
	 }
	 
	 public Properties props() {
		 Properties p=new Properties();
		 p.put("hibernate.dialect",env.getProperty("orm.dialect"));
		 p.put("hibernate.show_sql",env.getProperty("orm.showsql"));
		 p.put("hibernate.format_sql",env.getProperty("orm.fmtsql"));
		 p.put("hibernate.hbm2ddl.auto",env.getProperty("orm.ddlauto"));
	 
		 return p;
	 }
	//HT
	 @Bean
	 public HibernateTemplate ht() {
		 HibernateTemplate h=new HibernateTemplate();
		 h.setSessionFactory(sf().getObject());
		return h;
		 
	 }
	 //HtxM
	 @Bean
	 public HibernateTransactionManager htx() {
		 HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(sf().getObject());
		 return htm;
	 }
	//ViewResolver
	 @Bean
	 public InternalResourceViewResolver ivr() {
	 InternalResourceViewResolver v=new InternalResourceViewResolver() ;
	 v.setPrefix(env.getProperty("mvc.prefix"));
	 v.setSuffix(env.getProperty("mvc.suffix"));
	 return v;
}
}


