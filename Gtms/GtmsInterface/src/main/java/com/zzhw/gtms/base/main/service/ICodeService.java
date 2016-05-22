package com.zzhw.gtms.base.main.service;


import com.zzhw.gtms.dto.GtmsCodeDetailDto;
import com.zzhw.gtms.dto.GtmsCodeHeaderDto;
import com.zzhw.gtms.po.base.GtmsCodeDetailEntity;
import com.zzhw.gtms.po.base.GtmsCodeHeaderEntity;

import java.util.List;
import java.util.Map;

public interface ICodeService {


    public List<GtmsCodeHeaderEntity> getCodeHeader(Map<String, Object> map) throws Exception;

    public List<GtmsCodeDetailEntity> getCodeDetailList(Long codeId) throws Exception;

    public GtmsCodeHeaderEntity getCodeHeader(long id) throws Exception;

    public GtmsCodeHeaderEntity getCodeHeader(String listName) throws Exception;

    public GtmsCodeDetailEntity getCodeDetail(long id) throws Exception;

    public void updateCodeDetail(GtmsCodeDetailEntity codeDetailEntity) throws Exception;

    public void updateCodeHeader(GtmsCodeHeaderEntity codeHeaderEntity) throws Exception;

}
