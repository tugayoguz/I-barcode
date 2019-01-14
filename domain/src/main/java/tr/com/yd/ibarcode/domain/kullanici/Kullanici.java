package tr.com.yd.ibarcode.domain.kullanici;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;
import tr.com.yd.ibarcode.domain.birim.Birim;

/**
 * Created by PC-D69 on 23.09.2018.
 */
@Getter
@Setter
@Entity
@Table(name = "KULLANICI")
@SequenceGenerator(name = "seqGenerator", sequenceName = "KULLANICI_SEQ", allocationSize = 1)
public class Kullanici extends BaseEntity {

	@Column(name = "ADI")
	private String adi;

	@Column(name = "SOYADI")
	private String soyadi;

	@Column(name = "TC_KIMLIK_NO", unique=true)
	private String tcKimlikNo;

	@Column(name = "CEP_TEL")
	private String cepTel;

	@Column(name = "ADRES")
	private String adres;

	@ManyToOne()
	@JoinColumn(name = "BIRIM_ID")
	private Birim birim;

	@Column(name = "SIFRE")
	private String sifre;

	@Column(name = "KULLANICI_KODU",unique = true)
	private String kullaniciKodu;

}
