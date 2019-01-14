package tr.com.yd.ibarcode.service.sistem;

import java.util.List;

import tr.com.yd.ibarcode.domain.sistem.Il;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface IlService extends BaseService<Il>{

	List<Il> getAllIl();

	Il insert(Il il);

	Il update(Il il);

	void delete(Il il);
	
	Il findById(Long id);
}
