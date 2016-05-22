package com.zzhw.gtms.core.formwork.db.splitdb;

import com.zzhw.gtms.common.constants.Constants;
import com.zzhw.gtms.em.DbShareField;
import com.zzhw.gtms.vo.CurrenUserEntity;
import com.zzhw.gtms.vo.DbShardVO;
import org.apache.commons.lang3.ArrayUtils;

public class ShareDbUtil {

    public static DbShardVO getDbShardVO(CurrenUserEntity user,Long zoneId, DbShareField...source){
        DbShardVO dbShardVO = DbShardVO.getInstance(user);
        dbShardVO.setZoneId(zoneId);
        if(ArrayUtils.isNotEmpty(source)){
            dbShardVO.setSource(source[0]);
            //默认分表属性
            if(source[0] == DbShareField.ORDER || source[0] == DbShareField.GPS){
                dbShardVO.setShardTableId(user.getTenantId()+"");
            }
        }
        return dbShardVO;
    }

    public static DbShardVO getDbShardVO(CurrenUserEntity user, DbShareField...source){
        DbShardVO dbShardVO = DbShardVO.getInstance(user);
        if(ArrayUtils.isNotEmpty(source)){
            dbShardVO.setSource(source[0]);
            //默认分表属性
            if(source[0] == DbShareField.ORDER || source[0] == DbShareField.GPS){
                dbShardVO.setShardTableId(user.getTenantId()+"");
            }
        }
        return dbShardVO;
    }
}
