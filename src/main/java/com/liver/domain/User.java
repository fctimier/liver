package com.liver.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 普通用户
 *
 * @date 2020/12/29
 */
@Data
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 4786535619890762582L;

    @Id
    private Integer id;

    /**
     * 用户名（登录名）
     */
    private String username;

    private String password;

    /**
     *
     */
    private String realname;

    /**
     * 盐
     */
    private String salt;

    private Integer type;
    /**
     * 1 正常
     * 0 删除
     */
    private Integer status;

    private String email;

    private String telephone;

    private Date createTime;



}
