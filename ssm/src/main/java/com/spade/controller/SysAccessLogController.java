package com.spade.controller;

import com.spade.common.AssembleResponseMsg;
import com.spade.model.ResponseBody;
import com.spade.service.ISysAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 系统访问日志Controller
 *
 * @ClassName SysAccessLogController
 * @Description TODO
 * @Author AZhen
 * Version 1.0
 **/
@RestController
public class SysAccessLogController {
    @Autowired
    private ISysAccessLogService sysAccessLogService;

    /**
     * 查询系统访问日志列表
     *
     * @return com.wzz.model.ResponseInfo
     * @Author AZhen
     * @Param [map]
     **/
    @RequestMapping(value = "/sysLogList", produces = "application/json;charset=utf-8")
    public ResponseBody querySysLogList(@RequestBody Map<String, Object> map) {
        Map<String, Object> resultMap = sysAccessLogService.querySysLogList(map);
        return new AssembleResponseMsg().success(resultMap);
    }
}

