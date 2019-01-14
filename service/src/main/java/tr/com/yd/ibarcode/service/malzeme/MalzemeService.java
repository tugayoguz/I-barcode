package tr.com.yd.ibarcode.service.malzeme;


import java.util.List;

import tr.com.yd.ibarcode.domain.malzeme.Malzeme;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface MalzemeService extends BaseService<Malzeme>{

	List<Malzeme> getAllMalzeme();
	
	Malzeme insert(Malzeme malzeme);
	
	Malzeme update(Malzeme malzeme);
	
	void delete(Malzeme malzeme);
}
