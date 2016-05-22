package com.zzhw.gtms.uc.controller.order;

import com.zzhw.gtms.core.formwork.db.controller.BaseController;
import com.zzhw.gtms.core.web.ResponseResult;
import com.zzhw.gtms.dto.IonicDto;
import com.zzhw.gtms.order.service.IIonicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("api/ionic")
public class IonicController extends BaseController {

    private static final Logger _LOG = LoggerFactory.getLogger(IonicController.class);

    @Autowired
    private IIonicService ionicService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseResult queryIonics(@RequestBody IonicDto dto) throws Exception {
        return getSucResultData(ionicService.queryPageIonics(dto, getOrderDbShardVO()));
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseResult getAllIonics(@RequestParam Map map) throws Exception {
        return getSucResultData(ionicService.findAllIonics(map, getOrderDbShardVO()));
    }



}
