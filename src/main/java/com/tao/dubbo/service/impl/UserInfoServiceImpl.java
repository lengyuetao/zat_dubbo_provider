package com.tao.dubbo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.tao.dubbo.entity.UserInfo;
import com.tao.dubbo.service.UserInfoService;
import com.tao.dubbo.utils.RedisCache;
import com.tao.dubbo.utils.RedisUtils;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by DELL on 2017/9/22.
 */
public class UserInfoServiceImpl implements UserInfoService {

    private Logger logger=Logger.getLogger(UserInfoServiceImpl.class);


    public void insert(UserInfo userInfo) {
        JSONObject json=new JSONObject();
        json.put("userInfo",userInfo);
        RedisUtils.set("userInfo",json.toString(),100);
    }

    public void delete(String key) {
        System.out.println("此方法未实现!");
    }

    public List<UserInfo> getList() {
        return null;
    }

    public UserInfo getUserInfo(String key) {
        String value=RedisUtils.get(key);

        logger.info("getUserInfo:"+value);

        JSONObject json=JSONObject.parseObject(value);

        UserInfo userInfo= (UserInfo) json.get("userInfo");
        return userInfo;
    }
}
