package com.liver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @date 2020/12/29
 */
@RestController("sysUser/")
public class SysUserController {

    @PostMapping("login")
    public void login(){
        return ;
    }

    @PostMapping("addNewUser")
    public void addNewUser(){
        // 添加用户：包括系统用户和普通用户
    }

    @PostMapping("delete")
    public void deleteUser(){
        // 禁用用户
    }

    @PostMapping("")
    public void list(){

    }

}
