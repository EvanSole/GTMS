package com.zzhw.gtms.base.main.service.impl;

import com.zzhw.gtms.base.main.service.ICodeService;
import com.zzhw.gtms.common.SpringTxTestCase;
import com.zzhw.gtms.dto.GtmsCodeDetailDto;
import com.zzhw.gtms.po.base.main.GtmsCodeDetailEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CodeServiceTest extends SpringTxTestCase {

    @Autowired
    ICodeService codeService;

    @Test
    public void testFindUser() throws Exception {
        GtmsCodeDetailEntity codeDetailEntity = codeService.getCodeDetail(713);
        codeDetailEntity.setDescription("库内作业工具");
        codeService.updateCodeDetail(codeDetailEntity);
        //codeService.getCodeDetailList("InterfaceSystem");
    }



}