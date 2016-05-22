package com.zzhw.gtms.base.main.service.impl;

import com.zzhw.gtms.base.main.dao.CodeDetailDao;
import com.zzhw.gtms.base.main.dao.CodeHeaderDao;
import com.zzhw.gtms.base.main.service.ICodeService;
import com.zzhw.gtms.base.main.utils.redis.RedisTemplate;
import com.zzhw.gtms.common.constants.RedisConstants;
import com.zzhw.gtms.common.utils.JSONUtils;
import com.zzhw.gtms.core.formwork.db.service.BaseService;
import com.zzhw.gtms.dto.GtmsCodeDetailDto;
import com.zzhw.gtms.dto.GtmsCodeHeaderDto;
import com.zzhw.gtms.po.base.main.GtmsCodeDetailEntity;
import com.zzhw.gtms.po.base.main.GtmsCodeHeaderEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CodeService extends BaseService implements ICodeService {


    private static final Logger _LOG = LoggerFactory.getLogger(CodeService.class);

    @Autowired
    private CodeHeaderDao codeHeaderDao;

    @Autowired
    private CodeDetailDao codeDetailDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<GtmsCodeHeaderEntity> getCodeHeader(Map<String, Object> map) throws Exception {
        return codeHeaderDao.getCodeHeader(map);
    }

    @Override
    public List<GtmsCodeDetailEntity> getCodeDetailList(Long codeId) throws Exception {
        GtmsCodeHeaderEntity codeHeaderEntity = getCodeHeader(codeId);
        if (null != codeHeaderEntity) {
            List<GtmsCodeDetailEntity> codeDetailEntityList = JSONUtils.deserializes(redisTemplate.hget(RedisConstants.CODE_DATA, codeHeaderEntity.getListName()), GtmsCodeDetailEntity.class);
            if (CollectionUtils.isNotEmpty(codeDetailEntityList)) {
                return codeDetailEntityList;
            }
            return codeDetailDao.getCodeDetailList(codeId);
        }
        return null;
    }

    @Override
    public GtmsCodeHeaderEntity getCodeHeader(long id) throws Exception {
        return codeHeaderDao.get(id);
    }

    @Override
    public GtmsCodeHeaderEntity getCodeHeader(String listName) throws Exception {
        return codeHeaderDao.getCodeHeader(listName);
    }

    @Override
    public GtmsCodeDetailEntity getCodeDetail(long id) throws Exception {
        return codeDetailDao.get(id);
    }

    @Override
    public void updateCodeDetail(GtmsCodeDetailEntity codeDetailEntity) throws Exception {
        GtmsCodeDetailDto dto = new GtmsCodeDetailDto();
        BeanUtils.copyProperties(dto,codeDetailEntity);
        redisTemplate.hset(RedisConstants.CODE_DATA,getCodeHeader(codeDetailEntity.getCodeId()).getListName(),JSONUtils.serialize(dto));
        codeDetailDao.saveOrUpdate(codeDetailEntity);
    }

    @Override
    public void updateCodeHeader(GtmsCodeHeaderEntity codeHeaderEntity) throws Exception {
        codeHeaderDao.saveOrUpdate(codeHeaderEntity);
    }
}
