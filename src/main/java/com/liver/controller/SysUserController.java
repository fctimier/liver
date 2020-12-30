package com.liver.controller;

import com.liver.vo.UserInfoVo;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @date 2020/12/29
 */
@RestController
@RequestMapping("sysUser/")
public class SysUserController {

    

    @PostMapping("login")
    public void login(){
        System.out.println("访问成功");
    }

    @PostMapping("addNewUser")
    public void addNewUser(UserInfoVo userInfoVo){
        // 添加用户：包括系统用户和普通用户

    }

    @PutMapping("updateUser")
    public void updateUser(){

    }

    @DeleteMapping("delete")
    public void deleteUser(){
        // 禁用用户
    }

    @GetMapping("list")
    public void list(){
        System.out.println("list11");
    }

}
