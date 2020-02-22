package in.nit.dao;

import java.util.List;


import in.nit.model.WhuserType;

public interface IWhuserTypeDao {

	Integer saveWhuserType(WhuserType w);
	List<WhuserType> getAllWhuserType();
	public void deleteWhuserTypeType(Integer id);

}
