package com.spade.common;

import java.util.UUID;

/**
 * 各种ID工具类
 *
 * @ClassName IDUtil
 * @Description TODO
 * @Author spade
 * Version 1.0
 **/
public class IDUtil {

    /**
     * 获取uuid（以去掉'-'字符）
     *
     * @return java.lang.String
     * @Author spade
     * @Param []
     **/
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
