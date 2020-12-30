package com.liver.service;

import com.alibaba.fastjson.JSONObject;
import com.liver.vo.UserInfoVo;

import java.util.List;

public interface SysUserService {
    List<UserInfoVo> list(JSONObject query);

    UserInfoVo add(UserInfoVo userInfo);

    boolean delete(Integer id);

    boolean deleteList(List<Integer> ids);

    UserInfoVo update(UserInfoVo userInfo);
}
