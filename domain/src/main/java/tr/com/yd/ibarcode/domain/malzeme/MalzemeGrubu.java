package tr.com.yd.ibarcode.domain.malzeme;

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
@Table(name="MALZEME_GRUBU")
@SequenceGenerator(name = "seqGenerator", sequenceName = "MALZEME_GRUBU_SEQ", allocationSize = 1)
public class MalzemeGrubu extends BaseEntity {
    
	@Column(name="ADI",nullable=false)
	private String adi;

	@Column(name="KODU", unique=true, nullable=false)
    private String kodu;

}
