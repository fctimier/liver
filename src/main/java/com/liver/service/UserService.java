package com.liver.service;

import com.liver.vo.UserInfoVo;

import java.util.List;

public interface UserService {

    boolean login();

    boolean regist();

    List<UserInfoVo> list();
}
