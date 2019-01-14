package tr.com.yd.ibarcode.domain.sistem;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;

@Getter
@Setter
@Table(name="KUR")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "KUR_SEQ", allocationSize = 1)
public class Kur extends BaseEntity{

	@Column(name="KUR_DEGERI")
	private BigDecimal kurDegeri;
	
	@ManyToOne
	@JoinColumn(name="PARA_ID",nullable=false)
	private Para para;
	
	@Column(name="KUR_TARIHI")
	private Date kurTarihi;
	
}
