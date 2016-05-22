package com.zzhw.gtms.base.main.service.impl;

import com.zzhw.gtms.base.main.dao.UserDao;
import com.zzhw.gtms.base.main.service.IUserService;
import com.zzhw.gtms.core.formwork.db.service.BaseService;
import com.zzhw.gtms.po.base.GtmsUserEntity;
import com.zzhw.gtms.vo.CurrenUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService extends BaseService implements IUserService {

    private static final Logger _LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Map getUserPage(Map<String, Object> map) throws Exception {
        return userDao.getUserPage(map);
    }

    @Override
    public List<GtmsUserEntity> getUserList(Map<String, Object> map) throws Exception {
        return userDao.getUserList(map);
    }

    @Override
    public GtmsUserEntity getUser(String userName, String password){
        return userDao.getUser(userName,password);
    }

    @Override
    public GtmsUserEntity getUser(long id) throws Exception {
        return userDao.get(id);
    }

    @Override
    public void deleteUser(long id) throws Exception {
        userDao.delete(id);
    }

    @Override
    public GtmsUserEntity saveOrUpdate(GtmsUserEntity userEntity) throws Exception {
        return userDao.saveOrUpdate(userEntity);
    }

    @Override
    public String updatePassword(long userId, String passwordOld, String password, CurrenUserEntity currentUser) throws Exception {
        return null;
    }

    @Override
    public void correlationRoles(Long userId, Long... roleIds) throws Exception {

    }

    @Override
    public void uncorrelationRoles(Long userId, Long... roleIds) throws Exception {

    }

    @Override
    public GtmsUserEntity findByUserName(String userName){
        return userDao.findByUserName(userName);
    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }
}
