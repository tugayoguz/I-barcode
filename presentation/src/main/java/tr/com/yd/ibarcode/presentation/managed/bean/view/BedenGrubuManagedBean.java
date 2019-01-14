package tr.com.yd.ibarcode.presentation.managed.bean.view;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tr.com.yd.ibarcode.domain.sistem.BedenGrup;
import tr.com.yd.ibarcode.presentation.managed.bean.base.BaseManagedBean;
import tr.com.yd.ibarcode.service.sistem.BedenGrupService;

@Component
@Scope("view")
public class BedenGrubuManagedBean extends BaseManagedBean{

	@Autowired
	private BedenGrupService bedenGrupService;
	
	private BedenGrup bedenGrup;
	
	private BedenGrup selectedBedenGrup;
	
	private List<BedenGrup> bedenGrupList;
	
	@PostConstruct
	public void init(){
		bedenGrupList = bedenGrupService.getAllBedenGrup();
	}
	
	@Override
	public void ekle(){
		bedenGrup = new BedenGrup();
		super.ekle();
	}

	@Override
	public void guncelle(){
		bedenGrup = selectedBedenGrup;
		super.guncelle();
	}

	public void malzemeGrubuSil(){
		bedenGrupService.delete(selectedBedenGrup);
	}
	
	@Override
	public void kaydet(){
		bedenGrupList.add(bedenGrupService.insert(bedenGrup));
		selectedBedenGrup = null;
		super.kaydet();
	}
	
	@Override
	public void iptal(){
		selectedBedenGrup = null;
		super.iptal();
	}

	
	
	
	
	
	
	
	public BedenGrup getBedenGrup() {
		return bedenGrup;
	}

	public void setBedenGrup(BedenGrup bedenGrup) {
		this.bedenGrup = bedenGrup;
	}

	public BedenGrup getSelectedBedenGrup() {
		return selectedBedenGrup;
	}

	public void setSelectedBedenGrup(BedenGrup selectedBedenGrup) {
		this.selectedBedenGrup = selectedBedenGrup;
	}

	public List<BedenGrup> getBedenGrupList() {
		return bedenGrupList;
	}

	public void setBedenGrupList(List<BedenGrup> bedenGrupList) {
		this.bedenGrupList = bedenGrupList;
	}
	
	
}
