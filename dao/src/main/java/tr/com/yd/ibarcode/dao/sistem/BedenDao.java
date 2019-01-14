package tr.com.yd.ibarcode.dao.sistem;


import java.util.List;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;

public interface BedenDao extends BaseDao<Beden>{
	List<Beden> getAllBeden();

	List<Beden> getBedenByBedenGrupId(BedenGrup bedenGrup);
	
	Beden findById(Long id);

}
