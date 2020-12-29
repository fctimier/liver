package com.liver.responsitory;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.liver.vo.UserInfoVo;

import java.util.List;

public interface UserMapper {
    List<UserInfoVo> list();


}
