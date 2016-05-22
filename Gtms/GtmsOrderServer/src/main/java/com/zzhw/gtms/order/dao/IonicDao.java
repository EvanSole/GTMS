package com.zzhw.gtms.order.dao;

import com.zzhw.gtms.core.formwork.db.dao.BaseDao;
import com.zzhw.gtms.dto.IonicDto;
import com.zzhw.gtms.po.order.IonicEntity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class IonicDao extends BaseDao<IonicEntity> {

    public Map queryPageIonics(IonicDto dto,String splitTable) throws Exception {
        Map map = new HashMap();
        StringBuffer hql = new StringBuffer(" from IonicEntity t where 1=1 ");
        if (StringUtils.isNotBlank(dto.getTitle())) {
            hql.append(" and z.title like :title ");
            dto.setTitle("%" + dto.getTitle() + "%");
        }
        if (StringUtils.isNotBlank(dto.getContent())) {
            hql.append(" and z.content like :content ");
            dto.setContent("%" + dto.getContent() + "%");
        }
        return this.pageQueryByHql(hql.toString(),map,splitTable);
    }

    public List<IonicEntity>  findAllIonics(Map map, String splitTable) throws Exception {

        StringBuffer hql = new StringBuffer(" from IonicEntity t where 1=1 ");
        if (StringUtils.isNotBlank(MapUtils.getString(map, "title"))) {
            map.put("title","%"+map.get("title") +"%");
            hql.append(" and t.title like :title ");
        }
        if (StringUtils.isNotBlank(MapUtils.getString(map, "content"))) {
            map.put("content","%"+map.get("content") +"%");
            hql.append(" and t.content like :content ");
        }
        hql.append(" order by createTime desc");
        List<IonicEntity> list = this.findByHql(hql.toString(),map,splitTable);
        if(CollectionUtils.isNotEmpty(list)){
            return list;
        }
        return null;
    }
}
