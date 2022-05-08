package com.spade.mapper;

import com.spade.model.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserMapper
 * @Description TODO 用户持久层接口
 * @Author AZhen
 * Version 1.0
 **/
public interface UserMapper {
    List<User> queryUserList(Map<String, Object> map);

    //查询用户
    int queryUser(Map<String, Object> map);
}

