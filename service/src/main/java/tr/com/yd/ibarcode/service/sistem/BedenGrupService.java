package tr.com.yd.ibarcode.service.sistem;

import java.util.List;

import tr.com.yd.ibarcode.domain.sistem.BedenGrup;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface BedenGrupService extends BaseService<BedenGrup>{

	List<BedenGrup> getAllBedenGrup();

	BedenGrup insert(BedenGrup bedenGrup);

	BedenGrup update(BedenGrup bedenGrup);

	void delete(BedenGrup bedenGrup);
	
	BedenGrup findById(Long id);
}
