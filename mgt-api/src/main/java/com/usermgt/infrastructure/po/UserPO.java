package com.usermgt.infrastructure.po;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author hao.dai
 * @date 2019/8/18
 */
@Data
@Table(name = "user")
public class UserPO {
//    用户姓名、邮箱地址、注册地址、地区、ip地址、注册时间、登录时间
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;

    private String eMail;

    private String registerAddress;

    private String district;

    private String ip;

    private Date registerTime;

    private Date loginTime;

}
