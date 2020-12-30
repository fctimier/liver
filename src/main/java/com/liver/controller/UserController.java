package com.liver.controller;

import com.liver.service.UserService;
import com.liver.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制器
 *
 * @date 2020/12/29
 */
@RestController
@RequestMapping("userMapping")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("regist")
    public String regist(UserInfoVo userInfoVo){
        userService.regist();
        return "";
    }

}
