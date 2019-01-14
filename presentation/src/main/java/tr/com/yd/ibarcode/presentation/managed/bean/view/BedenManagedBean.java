package tr.com.yd.ibarcode.presentation.managed.bean.view;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.presentation.managed.bean.base.BaseManagedBean;
import tr.com.yd.ibarcode.service.sistem.BedenService;

@Component
@Scope("view")
public class BedenManagedBean extends BaseManagedBean{

	@Autowired
	private BedenService bedenService;
	
	private Beden beden;
	
	private Beden selectedBeden;
	
	private List<Beden> bedenList;
	
	@PostConstruct
	public void init(){
		bedenList = bedenService.getAllBeden();
	}
	
	@Override
	public void ekle(){
		beden = new Beden();
		super.ekle();
	}

	@Override
	public void guncelle(){
		beden = selectedBeden;
		super.guncelle();
	}

	public void malzemeGrubuSil(){
		bedenService.delete(selectedBeden);
	}
	
	@Override
	public void kaydet(){
		bedenList.add(bedenService.insert(beden));
		selectedBeden = null;
		super.kaydet();
	}
	
	@Override
	public void iptal(){
		selectedBeden = null;
		super.iptal();
	}

	public Beden getBeden() {
		return beden;
	}

	public void setBeden(Beden beden) {
		this.beden = beden;
	}

	public Beden getSelectedBeden() {
		return selectedBeden;
	}

	public void setSelectedBeden(Beden selectedBeden) {
		this.selectedBeden = selectedBeden;
	}

	public List<Beden> getBedenList() {
		return bedenList;
	}

	public void setBedenList(List<Beden> bedenList) {
		this.bedenList = bedenList;
	}

}
