package tr.com.yd.ibarcode.service.sistem;

import java.util.List;

import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface BedenService extends BaseService<Beden>{

	List<Beden> getAllBeden();
	
	List<Beden> getBedenByBedenGrupId(BedenGrup bedenGrup);

	Beden insert(Beden beden);

	Beden update(Beden beden);

	void delete(Beden beden);
	
	Beden findById(Long id);
}
