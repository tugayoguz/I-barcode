package tr.com.yd.ibarcode.domain.birim;

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
@Entity
@Table(name="BIRIM")
@SequenceGenerator(name = "seqGenerator", sequenceName = "BIRIM_SEQ", allocationSize = 1)
public class Birim extends BaseEntity {

	@Column(name="AD")
    private String ad;

	@Column(name="VERGI_NO")
    private String vergiNo;

	@Column(name="ADRES")
    private String adres;

//    @ManyToOne()
//	@JoinColumn(name="IL_ID")
//    private Il il;
//
//    @ManyToOne()
//	@JoinColumn(name="ILCE_ID")
//    private Ilce ilce;

}
