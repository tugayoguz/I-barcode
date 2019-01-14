package tr.com.yd.ibarcode.domain.tedarikci;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;

/**
 * Created by PC-D69 on 23.09.2018.
 */
@Getter
@Setter
@Table(name="FIRMA")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "FIRMA_SEQ", allocationSize = 1)
public class Firma extends BaseEntity {

	@Column(name="NAME")
    private String adi;

	@Column(name="ADRESI")
    private String adresi;

	@Column(name="VERGI_NO",unique=true)
    private String vergiNo;
	
	@Column(name="ILETISIM_TEL")
	private String iletisimTel;
}
