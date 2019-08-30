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
//    用户姓名、昵称、邮箱地址、手机、注册地址、地区、ip地址、注册时间、登录时间、投资年限

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;

    private String password;

    private String nickName;

    private String phone;

    private String eMail;

    private String registerAddress;

    private String district;

    private String ip;

    private Date investment_year;

    private Date registerTime;

    private Date loginTime;
}
