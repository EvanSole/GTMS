package com.zzhw.gtms.uc.controller.main;

import com.zzhw.gtms.base.main.service.IUserService;
import com.zzhw.gtms.core.formwork.db.controller.BaseController;
import com.zzhw.gtms.core.web.ResponseResult;
import com.zzhw.gtms.po.base.GtmsUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("api/user")
public class UserController extends BaseController {

    private static final Logger _LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseResult searchUsersPage(@RequestParam Map searchMap) throws Exception {
         return getSucResultData(userService.getUserPage(searchMap));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseResult addUser(@RequestBody GtmsUserEntity userEntity) throws Exception {
        userEntity.setCreateUser(this.getCurrentUser().getUserName());
        userEntity.setUpdateUser(this.getCurrentUser().getUserName());
        userService.saveOrUpdate(userEntity);
        return getSucMessage();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseResult deleteUser(@PathVariable long id) throws Exception {
        userService.deleteUser(id);
        return getSucMessage();
    }


}
