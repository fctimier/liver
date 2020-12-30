package com.liver.service.impl;

import com.liver.service.UserService;
import com.liver.vo.UserInfoVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @date 2020/12/29
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public boolean login() {
        return false;
    }

    @Override
    public boolean regist() {
        return false;
    }

    @Override
    public List<UserInfoVo> list() {
        return null;
    }
}
