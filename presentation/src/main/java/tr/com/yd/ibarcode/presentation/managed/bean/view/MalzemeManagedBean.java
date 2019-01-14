package tr.com.yd.ibarcode.presentation.managed.bean.view;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tr.com.yd.ibarcode.domain.malzeme.Malzeme;
import tr.com.yd.ibarcode.domain.malzeme.MalzemeGrubu;
import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;
import tr.com.yd.ibarcode.presentation.managed.bean.base.BaseManagedBean;
import tr.com.yd.ibarcode.service.malzeme.MalzemeGrubuService;
import tr.com.yd.ibarcode.service.malzeme.MalzemeService;
import tr.com.yd.ibarcode.service.sistem.BedenGrupService;

@Component
@Scope("view")
public class MalzemeManagedBean extends BaseManagedBean{

	@Autowired
	private MalzemeService malzemeService;

	@Autowired
	private MalzemeGrubuService malzemeGrubuService;

	@Autowired
	private BedenGrupService bedenGrupService;


	private List<Malzeme> malzemeList;

	private Malzeme malzeme;

	private Malzeme selectedMalzeme;

	private List<MalzemeGrubu> malzemeGrubuList;

	private List<BedenGrup> bedenGrupList;
	
	private List<Beden> bedenList;
	

	@PostConstruct
	public void init() {
		malzemeList = malzemeService.getAllMalzeme();
		malzemeGrubuList = malzemeGrubuService.getAllMazemeGrubu();
		bedenGrupList = bedenGrupService.getAllBedenGrup();
		setEditPanel(false);
	}

	@Override
	public void ekle(){
		super.ekle();
		malzeme = new Malzeme();
	}

	@Override
	public void guncelle(){
		super.guncelle();
		malzeme = selectedMalzeme;
	}

	public void malzemeSil(){
		malzemeService.delete(selectedMalzeme);
	}

	@Override
	public void kaydet(){
		malzemeService.insert(malzeme);
		selectedMalzeme = null;
		super.kaydet();
	}
	
	@Override
	public void iptal(){
		selectedMalzeme = null;
		super.iptal();
	}
	
	public void handleChange(){
		bedenList = malzeme.getBedenGrup().getBedenList();
	}


	//GETTER AND SETTER
	public Malzeme getMalzeme() {
		return malzeme;
	}

	public void setMalzeme(Malzeme malzeme) {
		this.malzeme = malzeme;
	}

	public Malzeme getSelectedMalzeme() {
		return selectedMalzeme;
	}

	public void setSelectedMalzeme(Malzeme selectedMalzeme) {
		this.selectedMalzeme = selectedMalzeme;
	}

	public List<MalzemeGrubu> getMalzemeGrubuList() {
		return malzemeGrubuList;
	}

	public void setMalzemeGrubuList(List<MalzemeGrubu> malzemeGrubuList) {
		this.malzemeGrubuList = malzemeGrubuList;
	}

	public List<Malzeme> getMalzemeList() {
		return malzemeList;
	}

	public void setMalzemeList(List<Malzeme> malzemeList) {
		this.malzemeList = malzemeList;
	}

	public MalzemeService getMalzemeService() {
		return malzemeService;
	}

	public void setMalzemeService(MalzemeService malzemeService) {
		this.malzemeService = malzemeService;
	}

	public MalzemeGrubuService getMalzemeGrubuService() {
		return malzemeGrubuService;
	}

	public void setMalzemeGrubuService(MalzemeGrubuService malzemeGrubuService) {
		this.malzemeGrubuService = malzemeGrubuService;
	}

	public List<BedenGrup> getBedenGrupList() {
		return bedenGrupList;
	}

	public void setBedenGrupList(List<BedenGrup> bedenGrupList) {
		this.bedenGrupList = bedenGrupList;
	}

	public List<Beden> getBedenList() {
		return bedenList;
	}

	public void setBedenList(List<Beden> bedenList) {
		this.bedenList = bedenList;
	}
	
	//	public String getImageContentsAsBase64() {
	//		if (file == null) {
	//			return "";
	//		}
	//		return Base64.getEncoder().encodeToString(file.getContents());
	//	}

}
