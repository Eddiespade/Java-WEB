package com.spade.common;

import eu.bitwalker.useragentutils.UserAgent;

import javax.servlet.http.HttpServletRequest;

/**
 * 字符串工具类
 *
 * @ClassName StringUtil
 * @Description TODO
 * @Author AZhen
 * Version 1.0
 **/
public class StringUtil {

    /**
     * 浏览器和系统信息
     *
     * @return java.lang.String
     * @Author AZhen
     * @Param [request]
     **/
    public static String getBrowserSystemInfo(HttpServletRequest request) {
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("user-agent"));
        String BSInfo = userAgent.getOperatingSystem() + "-" + userAgent.getBrowser() + "(" + userAgent.getBrowserVersion() + ")";
        return BSInfo;
    }

}


