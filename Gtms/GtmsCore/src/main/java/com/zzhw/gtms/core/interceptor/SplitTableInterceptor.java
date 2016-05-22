package com.zzhw.gtms.core.interceptor;

import com.zzhw.gtms.core.formwork.db.dao.DatabaseContextHolder;
import com.zzhw.gtms.core.formwork.db.splitdb.DbShardsUtil;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.EmptyInterceptor;

public class SplitTableInterceptor extends EmptyInterceptor {

    @Override
    public String onPrepareStatement(String sql) {
        String splitFlag = DatabaseContextHolder.getCustomerTable();

        if (StringUtils.isEmpty(splitFlag)) {
            return sql;
        }
        return DbShardsUtil.parseSql(sql, splitFlag);
    }

}
