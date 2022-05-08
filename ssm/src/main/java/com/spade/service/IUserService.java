package com.spade.service;

import java.util.Map;

/**
 * @ClassName IUserService
 * @Description TODO 用户业务层接口
 * @Author AZhen
 * Version 1.0
 **/
public interface IUserService {
    Map<String, Object> queryUserList(Map<String, Object> map);

    int queryUser(Map<String, Object> map);
}

