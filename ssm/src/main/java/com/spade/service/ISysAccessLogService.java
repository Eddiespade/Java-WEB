package com.spade.service;

import java.util.Map;

/**
 * 系统访问日志接口
 *
 * @ClassName ISysAccessLogService
 * @Description TODO
 * @Author AZhen
 * Version 1.0
 **/
public interface ISysAccessLogService {

    /**
     * 查询系统日志列表
     *
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @Author AZhen
     * @Param [map]
     **/
    public Map<String, Object> querySysLogList(Map<String, Object> map);

    /**
     * 保存日志
     *
     * @return int
     * @Author AZhen
     * @Param [map]
     **/
    public int saveSysLog(Map<String, Object> map);
}

