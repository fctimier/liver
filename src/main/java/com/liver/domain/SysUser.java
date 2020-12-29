package com.liver.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *  系统用户
 * @author lfc
 */
@Data
@Entity
public class SysUser implements Serializable {

    private static final long serialVersionUID = -3575093751882356998L;
    //@Column(unique = true, nullable = false)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    /**
     * 用户名（登录名）
     */
    private String username;

    private String password;

}
