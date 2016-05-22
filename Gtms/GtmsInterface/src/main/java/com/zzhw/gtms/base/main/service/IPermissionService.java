package com.zzhw.gtms.base.main.service;

import com.zzhw.gtms.po.base.GtmsPermissionEntity;

public interface IPermissionService {
   public GtmsPermissionEntity createPermission(GtmsPermissionEntity permission);
   public void deletePermission(Long permissionId);

}
