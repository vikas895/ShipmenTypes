package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhuserTypeDao;
import in.nit.model.WhuserType;

@Repository
public class WhuserTypeDaoImpl implements IWhuserTypeDao {
	
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Integer saveWhuserType(WhuserType w) {
		Integer id =(Integer)ht.save(w);
		return id;
	}

	@Override
	public List<WhuserType> getAllWhuserType() {
	
		return ht.loadAll(WhuserType.class);
	}

	@Override
	public void deleteWhuserTypeType(Integer id) {
		ht.delete(new WhuserType(id));
		
	}


}
