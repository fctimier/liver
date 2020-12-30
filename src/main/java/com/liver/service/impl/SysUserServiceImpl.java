package com.liver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.liver.service.SysUserService;
import com.liver.vo.UserInfoVo;

import java.util.List;

/**
 * TODO
 *
 * @date 2020/12/30
 */
public class SysUserServiceImpl implements SysUserService {



    @Override
    public List<UserInfoVo> list(JSONObject query) {
        return null;
    }

    @Override
    public UserInfoVo add(UserInfoVo userInfo) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean deleteList(List<Integer> ids) {
        return false;
    }

    @Override
    public UserInfoVo update(UserInfoVo userInfo) {
        return null;
    }
}
