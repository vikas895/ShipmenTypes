package in.nit.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import in.nit.model.WhuserType;
import in.nit.service.IWhuserTypeService;

public class WhuserTypeServiceImpl implements IWhuserTypeService {
	

	@Autowired
	private IWhuserTypeService dao;

	@Override
	@Transactional
	public Integer saveWhuserType(WhuserType w) {
		return dao.saveWhuserType(w);
		
	}

	@Override
	@Transactional
	public List<WhuserType> getAllWhuserType() 
	{
		return dao.getAllWhuserType();
	}

	@Override
	@Transactional
	public void deleteWhuserTypeType(Integer id) 
	
	{
		dao.deleteWhuserTypeType(id);
	}

}


