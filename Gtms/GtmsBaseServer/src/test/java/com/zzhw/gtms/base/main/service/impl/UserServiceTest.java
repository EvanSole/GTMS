package com.zzhw.gtms.base.main.service.impl;

import com.zzhw.gtms.base.main.service.IUserService;
import com.zzhw.gtms.common.SpringTxTestCase;
import com.zzhw.gtms.po.base.main.GtmsUserEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends SpringTxTestCase {

    @Autowired
    IUserService userService;

    @Test
    public void testFindUser() throws Exception {
        GtmsUserEntity userEntity = userService.getUser(1L);
        System.out.println("userEntity-->"+userEntity.getUserName());
    }
}
