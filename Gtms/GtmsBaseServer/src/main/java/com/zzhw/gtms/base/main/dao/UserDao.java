package com.zzhw.gtms.base.main.dao;

import com.zzhw.gtms.core.formwork.db.dao.BaseDao;
import com.zzhw.gtms.po.base.GtmsUserEntity;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao extends BaseDao<GtmsUserEntity> {

    public GtmsUserEntity getUser(String userName, String password) {
        StringBuffer sb = new StringBuffer(" from GtmsUserEntity t where 1=1 and t.isDel=0");
        sb.append(" and t.userName=:userName");
        sb.append(" and t.password=:password");
        Map map = new HashMap();
        map.put("userName", userName);
        map.put("password", password);
        return (GtmsUserEntity) this.executeScalarByHql(sb.toString(), map);
    }


    public GtmsUserEntity findByUserName(String userName) {
        Map map = new HashMap();
        StringBuffer sb = new StringBuffer(" from GtmsUserEntity t where 1=1 and t.isDel=0 ");
        if (StringUtils.isNotEmpty(userName)){
            sb.append(" and t.userName=:userName");
             map.put("userName", userName);
        }
        return (GtmsUserEntity) this.executeScalarByHql(sb.toString(), map);
    }



    public List<GtmsUserEntity> getUserList(Map<String, Object> map) {
        StringBuffer sb = new StringBuffer(" from GtmsUserEntity t where 1=1 and t.isDel=0 ");
        return this.findByHql(sb.toString(),map);
    }

    public Map getUserPage(Map<String, Object> map) throws Exception {
        StringBuffer hql = new StringBuffer(" from GtmsUserEntity t where 1=1 and t.isDel=0");

        if (StringUtils.isNotBlank(MapUtils.getString(map, "userName"))) {
            map.put("userName","%"+map.get("userName") +"%");
            hql.append(" and t.userName like :userName ");
        }
        if (StringUtils.isNotBlank(MapUtils.getString(map, "realName"))) {
            map.put("realName","%"+map.get("realName") +"%");
            hql.append(" and t.realName like :realName ");
        }
        hql.append(" order by createTime desc");
        return this.pageQueryByHql(hql.toString(),map);
    }


}
