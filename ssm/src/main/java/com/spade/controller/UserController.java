package com.spade.controller;

import com.spade.common.AssembleResponseMsg;
import com.spade.model.ResponseBody;
import com.spade.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName UserController
 * @Description TODO 用户控制层
 * @Author AZhen
 * Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/queryUserList", produces = "application/json;charset=utf-8")
    public ResponseBody queryUserList(@RequestBody Map<String, Object> map) {
        Map<String, Object> resultMap = userService.queryUserList(map);
        return new AssembleResponseMsg().success(resultMap);
    }

    @RequestMapping(value = "/queryUser", produces = "application/json;charset=utf-8")
    public ResponseBody queryUser(@RequestBody Map<String, Object> map) {
        int flag = userService.queryUser(map);
        if (flag == 1) {
            return new AssembleResponseMsg().success("OK");
        }
        {
            return new AssembleResponseMsg().failure(200, "error", "用户名或密码错误");
        }
    }

}

