package tr.com.yd.ibarcode.presentation.managed.bean.view;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tr.com.yd.ibarcode.domain.malzeme.MalzemeGrubu;
import tr.com.yd.ibarcode.presentation.managed.bean.base.BaseManagedBean;
import tr.com.yd.ibarcode.service.malzeme.MalzemeGrubuService;

@Component
@Scope("view")
public class MalzemeGrubuManagedBean extends BaseManagedBean{

	@Autowired
	private MalzemeGrubuService malzemeGrubuService;

	private List<MalzemeGrubu> malzemeGrubuList;

	private MalzemeGrubu malzemeGrubu;

	private MalzemeGrubu selectedMalzemeGrubu;

	@PostConstruct
	public void init(){
		malzemeGrubuList = malzemeGrubuService.getAllMazemeGrubu();
	}

	@Override
	public void ekle(){
		malzemeGrubu = new MalzemeGrubu();
		super.ekle();
	}

	@Override
	public void guncelle(){
		malzemeGrubu = selectedMalzemeGrubu;
		super.guncelle();
	}

	public void malzemeGrubuSil(){
		malzemeGrubuService.delete(selectedMalzemeGrubu);
	}
	
	@Override
	public void kaydet(){
		malzemeGrubuService.insert(malzemeGrubu);
		selectedMalzemeGrubu = null;
		super.kaydet();
	}
	
	@Override
	public void iptal(){
		selectedMalzemeGrubu = null;
		super.iptal();
	}


	public MalzemeGrubuService getMalzemeGrubuService() {
		return malzemeGrubuService;
	}

	public void setMalzemeGrubuService(MalzemeGrubuService malzemeGrubuService) {
		this.malzemeGrubuService = malzemeGrubuService;
	}

	public List<MalzemeGrubu> getMalzemeGrubuList() {
		return malzemeGrubuList;
	}

	public void setMalzemeGrubuList(List<MalzemeGrubu> malzemeGrubuList) {
		this.malzemeGrubuList = malzemeGrubuList;
	}

	public MalzemeGrubu getMalzemeGrubu() {
		return malzemeGrubu;
	}

	public void setMalzemeGrubu(MalzemeGrubu malzemeGrubu) {
		this.malzemeGrubu = malzemeGrubu;
	}

	public MalzemeGrubu getSelectedMalzemeGrubu() {
		return selectedMalzemeGrubu;
	}

	public void setSelectedMalzemeGrubu(MalzemeGrubu selectedMalzemeGrubu) {
		this.selectedMalzemeGrubu = selectedMalzemeGrubu;
	}



}
