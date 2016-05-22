package com.zzhw.gtms.order;

import com.zzhw.gtms.common.SpringTxTestCase;
import com.zzhw.gtms.core.formwork.db.splitdb.ShareDbUtil;
import com.zzhw.gtms.em.DbShareField;
import com.zzhw.gtms.order.service.IIonicService;
import com.zzhw.gtms.po.order.IonicEntity;
import com.zzhw.gtms.vo.CurrenUserEntity;
import com.zzhw.gtms.vo.DbShardVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class IonicServiceTest extends SpringTxTestCase {

    @Autowired
    IIonicService ionicService;

    @Test
    public void testFindIonicEntitys() throws Exception {

        CurrenUserEntity userEntity = new CurrenUserEntity();
        userEntity.setUserName("admin");
        userEntity.setPassword("123456");
        userEntity.setTenantId(88L);
        DbShardVO dbShardVO = ShareDbUtil.getDbShardVO(userEntity,DbShareField.ORDER);

        IonicEntity ionicEntity = new IonicEntity();
        ionicEntity.setZoneId(88L);
        ionicEntity.setTitle("三国演义");
        ionicEntity.setContent("笑里藏刀");
        ionicEntity.setFaceImage("None");
        ionicEntity.setCreateUser("admin");
        ionicEntity.setCreateTime(new Date().getTime());
        ionicEntity.setUpdateUser("admin");
        ionicEntity.setUpdateTime(new Date().getTime());

        ionicService.saveOrUpdateIonic(ionicEntity,dbShardVO);

        List<IonicEntity> list = ionicService.findAllIonics(null,dbShardVO);
        System.out.println("IonicEntitys-->"+list.size());
    }
}
