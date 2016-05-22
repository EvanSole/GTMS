package com.zzhw.gtms.order.service;

import com.zzhw.gtms.dto.IonicDto;
import com.zzhw.gtms.po.order.IonicEntity;
import com.zzhw.gtms.vo.DbShardVO;

import java.util.List;
import java.util.Map;

public interface IIonicService {

    public Map queryPageIonics(IonicDto ionicDto,DbShardVO dbShardVO) throws Exception;

    public List<IonicEntity> findAllIonics(Map map,DbShardVO dbShardVO) throws Exception;

    public IonicEntity saveOrUpdateIonic(IonicEntity ionicEntity, DbShardVO dbShardVO) throws Exception;

    public void deleteIonic(long id) throws Exception;

    public IonicEntity getIonicById(long id) throws Exception;

}
