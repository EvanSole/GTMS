package com.zzhw.gtms.base.main.dao;

import com.zzhw.gtms.core.formwork.db.dao.BaseDao;
import com.zzhw.gtms.po.base.main.GtmsCodeDetailEntity;
import com.zzhw.gtms.po.base.main.GtmsCodeHeaderEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class CodeDetailDao extends BaseDao<GtmsCodeDetailEntity> {

    public List<GtmsCodeDetailEntity> getCodeDetailList(Long codeId) {
        Map map = new HashMap();
        StringBuffer sb = new StringBuffer(" from GtmsCodeDetailEntity t where 1=1 ");
        if (codeId != 0){
            sb.append(" and t.codeId=:codeId");
            map.put("codeId", codeId);
        }
        return this.findByHql(sb.toString(), map);
    }
}
