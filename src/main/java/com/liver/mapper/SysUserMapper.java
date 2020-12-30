package com.liver.mapper;

import com.alibaba.fastjson.JSONObject;
import com.liver.vo.UserInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysUserMapper {
    String sysUser = "sys_user";

    @Select("select from ")
    List<UserInfoVo> list(JSONObject query);

}
