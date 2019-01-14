package tr.com.yd.ibarcode.presentation.managed.bean.base;

public class BaseManagedBean {

	private boolean editPanel;

	public void ekle(){
		editPanel = true;
	}

	public void guncelle(){
		editPanel = true;
	}

	public void iptal(){
		editPanel = false;
	}
	
	public void kaydet(){
		editPanel = false;
	}

	public boolean isEditPanel() {
		return editPanel;
	}

	public void setEditPanel(boolean editPanel) {
		this.editPanel = editPanel;
	}

}
