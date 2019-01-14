package tr.com.yd.ibarcode.dao.sistem;

import java.util.List;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.sistem.Il;

public interface IlDao extends BaseDao<Il>{

	List<Il> getAllIl();
	
	Il findById(Long id);
}
