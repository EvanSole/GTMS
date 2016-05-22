package com.zzhw.gtms.base.main.service;

import com.zzhw.gtms.dto.GtmsUserDto;
import com.zzhw.gtms.po.base.GtmsUserEntity;
import com.zzhw.gtms.vo.CurrenUserEntity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IUserService {

    public List<GtmsUserEntity> getUserList(Map<String,Object> map) throws Exception;

    public Map getUserPage(Map<String,Object> map) throws Exception;

    public GtmsUserEntity getUser(String userName,String password);

    public GtmsUserEntity getUser(long id) throws Exception;

    public void deleteUser(long id) throws Exception;

    public GtmsUserEntity saveOrUpdate(GtmsUserEntity userEntity) throws Exception;

    public String updatePassword(long userId, String passwordOld, String password, CurrenUserEntity currentUser) throws Exception;

    public void correlationRoles(Long userId, Long... roleIds) throws Exception; //添加用户-角色关系

    public void uncorrelationRoles(Long userId, Long... roleIds) throws Exception;// 移除用户-角色关系

    public GtmsUserEntity findByUserName(String userName);// 根据用户名查找用户

    public Set<String> findRoles(String username);// 根据用户名查找其角色

    public Set<String> findPermissions(String username); //根据用户名查找其权限

}
