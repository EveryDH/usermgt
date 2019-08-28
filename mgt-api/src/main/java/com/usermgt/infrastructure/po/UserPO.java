package com.usermgt.infrastructure.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hao.dai
 * @date 2019/8/18
 */
@Data
@Table(name = "user")
public class UserPO {
//    用户姓名、邮箱地址、注册地址、地区、ip地址、注册时间、登录时间
    @Id
    @Column
    private Integer id;

    @Column
    private String userName;

    @Column
    private String eMail;

    @Column
    private String registerAddress;

    @Column
    private String district;

    @Column
    private String ip;

    @Column
    private String registerTime;

    @Column
    private String loginTime;

}
