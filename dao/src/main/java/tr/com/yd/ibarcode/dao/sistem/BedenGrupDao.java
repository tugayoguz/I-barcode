package tr.com.yd.ibarcode.dao.sistem;

import java.util.List;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;

public interface BedenGrupDao extends BaseDao<BedenGrup>{

	List<BedenGrup> getAllBedenGrup();
	
	BedenGrup findById(Long id);
}
