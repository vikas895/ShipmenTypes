package in.nit.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import in.nit.config.AppConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		// TODO Auto-generated method stub
		return new Class[]{AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		// TODO Auto-generated method stub
		return null;
	}
//URL=pattern
	@Override
	protected String[] getServletMappings() 
	{
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}



















