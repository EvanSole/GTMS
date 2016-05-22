package com.zzhw.gtms.common.constants;

import java.util.HashMap;
import java.util.Map;

public class AutoIdConstants {

    /**
     * ********************db数据库里的表******
     */
    public static final int IonicEntity = 1000;
    public static final int GtmsUserEntity = 2000;
    public static final int GtmsRoleEntity = 3000;
    public static final int GtmsPermissionEntity = 4000;


    public static final int GtmsCodeHeaderEntity = 5000;
    public static final int GtmsCodeDetailEntity = 6000;

    /**
     * 获取需要到autoid服务中得到id的表
     *
     * @return
     */
    public static final Map<String, Integer> getMap() {
        //每添加一个,需要加入集合
        Map<String, Integer> map = new HashMap<>();
        map.put("IonicEntity", IonicEntity);
        map.put("GtmsUserEntity", GtmsUserEntity);
        map.put("GtmsRoleEntity", GtmsRoleEntity);
        map.put("GtmsPermissionEntity", GtmsPermissionEntity);
        map.put("GtmsCodeHeaderEntity", GtmsCodeHeaderEntity);
        map.put("GtmsCodeDetailEntity", GtmsCodeDetailEntity);
        return map;
    }

}
