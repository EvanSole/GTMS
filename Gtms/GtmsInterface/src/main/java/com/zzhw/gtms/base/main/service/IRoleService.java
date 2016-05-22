package com.zzhw.gtms.base.main.service;

import com.zzhw.gtms.po.base.GtmsRoleEntity;
import com.zzhw.gtms.vo.MessageResult;

import java.util.Map;


public interface IRoleService {

    public Map queryRoles(Map map);

    public MessageResult saveRole(GtmsRoleEntity entity);

    public MessageResult updateRole(GtmsRoleEntity entity);

    public MessageResult deleteRole(Long id);

    //添加角色-权限之间关系
    public void correlationPermissions(Long roleId, Long... permissionIds);

    //移除角色-权限之间关系
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);



}
