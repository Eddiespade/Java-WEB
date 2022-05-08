package com.spade.common;

import com.spade.model.InfoMsg;
import com.spade.model.ResponseBody;

/**
 * @ClassName AssembleResponseMsg
 * @Description TODO  封装ResponseBody内容
 * @Author spade
 * Version 1.0
 **/
public class AssembleResponseMsg {

    /**
     * 成功返回内容
     *
     * @return com.wzz.model.ResponseBody
     * @Author AZhen
     * @Param [data]
     **/
    public <T> ResponseBody success(T data) {
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setData(data);
        InfoMsg info = new InfoMsg();
        resp.setInfo(info);
        return resp;
    }

    /**
     * 失败/异常返回内容
     *
     * @return com.wzz.model.ResponseBody
     * @Author AZhen
     * @Param [status, errorCode, message]
     **/
    public <T> ResponseBody failure(int status, String errorCode, String message) {
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setStatus(status);
        InfoMsg info = new InfoMsg();
        info.setCode(errorCode);
        info.setMessage(message);
        resp.setInfo(info);
        return resp;
    }
}


