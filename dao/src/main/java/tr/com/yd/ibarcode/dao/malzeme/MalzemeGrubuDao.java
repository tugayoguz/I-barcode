package tr.com.yd.ibarcode.dao.malzeme;

import java.util.List;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.malzeme.MalzemeGrubu;

public interface MalzemeGrubuDao extends BaseDao<MalzemeGrubu>{

	
	List<MalzemeGrubu> getAllMalzemeGrubu();
	
	MalzemeGrubu findById(Long id);
}
