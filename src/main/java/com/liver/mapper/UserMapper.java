package com.liver.mapper;

import com.liver.vo.UserInfoVo;

import java.util.List;

public interface UserMapper {
    List<UserInfoVo> list();

    void addUser(UserInfoVo userInfo);

    void deleteUser(Integer id);

    void deleteUsers(List<Integer> ids);

    void updateUser(UserInfoVo userInfo);


}
