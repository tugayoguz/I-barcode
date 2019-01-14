package tr.com.yd.ibarcode.service.sistem;

import java.util.List;

import tr.com.yd.ibarcode.domain.sistem.Il;
import tr.com.yd.ibarcode.domain.sistem.Ilce;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface IlceService extends BaseService<Ilce>{

	List<Ilce> getAllIlce();
	
	List<Ilce> getIlceByIl(Il il);

	Ilce insert(Ilce ilce);

	Ilce update(Ilce ilce);

	void delete(Ilce ilce);
	
	Ilce findById(Long id);
}
