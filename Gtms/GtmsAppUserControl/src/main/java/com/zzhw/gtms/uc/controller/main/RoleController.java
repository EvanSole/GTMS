package com.zzhw.gtms.uc.controller.main;

import com.wordnik.swagger.annotations.ApiOperation;
import com.zzhw.gtms.base.main.service.IRoleService;
import com.zzhw.gtms.core.formwork.db.controller.BaseController;
import com.zzhw.gtms.core.web.ResponseResult;
import com.zzhw.gtms.po.base.GtmsRoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/role")
public class RoleController extends BaseController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "", notes = "查询角色信息", response = GtmsRoleEntity.class)
    public ResponseResult queryRoles(@RequestParam Map map){
        map.put("tenantId", getCurrentUser().getTenantId());
        return new ResponseResult(roleService.queryRoles(map));
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "", notes = "保存角色信息", response = GtmsRoleEntity.class)
    public ResponseResult saveCustomer(@RequestBody GtmsRoleEntity entity){
        entity.setCreateUser(getCurrentUser().getUserName());
        entity.setUpdateUser(getCurrentUser().getUserName());
        return getMessage(roleService.saveRole(entity));
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    @ApiOperation(value = "", notes = "修改客户信息", response = GtmsRoleEntity.class)
    public ResponseResult updateCustomer(@RequestBody GtmsRoleEntity entity){
        entity.setTenantId(getCurrentUser().getTenantId());
        entity.setUpdateUser(getCurrentUser().getUserName());
        return getMessage(roleService.updateRole(entity));
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "", notes = "删除客户信息")
    public ResponseResult deleteCustomer(@PathVariable Long id){
        return getMessage(roleService.deleteRole(id));
    }
}
