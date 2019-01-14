package tr.com.yd.ibarcode.domain.hareket;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;

/**
 * Created by PC-D69 on 23.09.2018.
 */
@Getter
@Setter
public class StokGiris extends BaseEntity {

   private Date girisTarihi;
   
   private String girisNo;
   
   private List<StokGirisDetay> stokGirisDetayList;

}
