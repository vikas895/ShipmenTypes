package in.nit.service;

import java.util.List;

import in.nit.model.WhuserType;

public interface IWhuserTypeService {

	Integer saveWhuserType(WhuserType w);
	List<WhuserType> getAllWhuserType();
	public void deleteWhuserTypeType(Integer id);

}
