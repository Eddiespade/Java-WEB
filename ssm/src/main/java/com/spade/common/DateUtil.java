package com.spade.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description TODO  日期工具类
 * @Author AZhen
 * Version 1.0
 **/
public class DateUtil {

    /**
     * 返回字符串形式的当前日期
     *
     * @return java.lang.String
     * @Author AZhen
     * @Param [pattern]  模板参数  如："yyyy-MM-dd"
     **/
    public static String getCurrentDateStr(String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String currentDateStr = format.format(new Date());
        return currentDateStr;
    }
}
