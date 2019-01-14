package tr.com.yd.ibarcode.domain.hareket;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;
import tr.com.yd.ibarcode.domain.malzeme.Malzeme;
import tr.com.yd.ibarcode.domain.sistem.Para;
import tr.com.yd.ibarcode.domain.tedarikci.Firma;

@Getter
@Setter
public class StokGirisDetay extends BaseEntity{

	private StokGiris stokGiris;
	
	private String aciklama;

	private Para alisParaBirim;

	private BigDecimal alisFiyat;

	private Malzeme malzeme;

	private Firma firma;

	private BigDecimal adet;

	private BigDecimal satisFiyat;
	
	private Para satisParaBirimi;
	
	private String firmaBarcode;
	
	private String barcode;
	
}
