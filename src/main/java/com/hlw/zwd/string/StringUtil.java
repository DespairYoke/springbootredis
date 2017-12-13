package com.hlw.zwd.string;

import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

public class StringUtil{
    @Resource(name="redisTemplate")
    private ValueOperations<String,Object> valops;
    public void set(String key,String value){
        valops.set(key,value);
    }
    public Object get(Object key)
    {
        return valops.get(key);
    }
}