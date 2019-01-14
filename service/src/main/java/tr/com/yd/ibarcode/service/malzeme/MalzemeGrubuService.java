package tr.com.yd.ibarcode.service.malzeme;

import java.util.List;

import tr.com.yd.ibarcode.domain.malzeme.MalzemeGrubu;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface MalzemeGrubuService extends BaseService<MalzemeGrubu>{

	List<MalzemeGrubu> getAllMazemeGrubu();
	
	MalzemeGrubu findById(Long id);

	MalzemeGrubu insert(MalzemeGrubu malzemeGrubu);

	MalzemeGrubu update(MalzemeGrubu malzemeGrubu);

	void delete(MalzemeGrubu malzemeGrubu);
}
