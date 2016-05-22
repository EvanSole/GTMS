package com.zzhw.gtms.base.main.dao;

import com.zzhw.gtms.core.formwork.db.dao.BaseDao;
import com.zzhw.gtms.po.base.main.GtmsCodeHeaderEntity;
import com.zzhw.gtms.po.base.main.GtmsUserEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CodeHeaderDao extends BaseDao<GtmsCodeHeaderEntity> {


    public GtmsCodeHeaderEntity getCodeHeader(String listName) {
        Map map = new HashMap();
        StringBuffer sb = new StringBuffer(" from GtmsCodeHeaderEntity t where 1=1 ");
        if (StringUtils.isNotEmpty(listName)){
            sb.append(" and t.listName=:listName");
            map.put("listName", listName);
        }
        return (GtmsCodeHeaderEntity) this.executeScalarByHql(sb.toString(), map);
    }

    public List<GtmsCodeHeaderEntity> getCodeHeader(Map<String, Object> map) {
        StringBuffer hql = new StringBuffer(" from GtmsCodeHeaderEntity t where 1=1 ");
        searchParam(map,hql);
        return this.findByHql(hql.toString(),map);
    }

    private void searchParam(Map map, StringBuffer hql) {
        if(map.containsKey("listName")){
            hql.append(" and t.listName=:listName ");
        }
    }
}
