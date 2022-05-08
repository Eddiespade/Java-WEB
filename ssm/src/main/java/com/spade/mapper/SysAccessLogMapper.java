package com.spade.mapper;

import java.util.List;
import java.util.Map;


public interface SysAccessLogMapper {

    List<Map<String,Object>> querySysLogList(Map<String,Object> map);

    int saveSysLog(Map<String,Object> map);
}
