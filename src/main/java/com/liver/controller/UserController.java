package com.liver.controller;

import com.liver.service.UserService;
import com.liver.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制器
 *
 * @date 2020/12/29
 */
@RestController("")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public String login(){
        userService.list();
        return "";
    }

    @PostMapping("regist")
    public String regist(UserInfoVo userInfoVo){
        userService.regist();
        return "";
    }

}
