package com.spade.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spade.mapper.UserMapper;
import com.spade.model.User;
import com.spade.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Description TODO  用户业务层实现类
 * @Author AZhen
 * Version 1.0
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> queryUserList(Map<String, Object> map) {
        int pageNum = Integer.parseInt(map.get("pageNum").toString()); //当前页
        int pageSize = Integer.parseInt(map.get("pageSize").toString());  //每页几条
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.queryUserList(map);
        PageInfo pageInfo = new PageInfo(userList);
        long total = pageInfo.getTotal();
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("total", total);
        resultMap.put("rows", userList);
        return resultMap;
    }

    @Override
    public int queryUser(Map<String, Object> map) {
        return userMapper.queryUser(map);
    }
}

