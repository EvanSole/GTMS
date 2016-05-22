package com.zzhw.gtms.order.service.impl;

import com.zzhw.gtms.core.formwork.db.service.BaseService;
import com.zzhw.gtms.dto.IonicDto;
import com.zzhw.gtms.order.dao.IonicDao;
import com.zzhw.gtms.order.service.IIonicService;
import com.zzhw.gtms.po.order.IonicEntity;
import com.zzhw.gtms.vo.DbShardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IonicService extends BaseService implements IIonicService {

    private static final Logger log = LoggerFactory.getLogger(IonicService.class);

    @Autowired
    private IonicDao ionicDao;

    @Override
    public Map queryPageIonics(IonicDto ionicDto, DbShardVO dbShardVO) throws Exception {
        return ionicDao.queryPageIonics(ionicDto, getSplitTableKey(dbShardVO));
    }

    @Override
    public List<IonicEntity> findAllIonics(Map map, DbShardVO dbShardVO) throws Exception {
        return ionicDao.findAllIonics(map,getSplitTableKey(dbShardVO));
    }

    @Override
    public IonicEntity saveOrUpdateIonic(IonicEntity ionicEntity, DbShardVO dbShardVO) throws Exception {
       return ionicDao.saveOrUpdate(ionicEntity,getSplitTableKey(dbShardVO));
    }

    @Override
    public void deleteIonic(long id) throws Exception {

    }

    @Override
    public IonicEntity getIonicById(long id) throws Exception {
        return null;
    }


}
