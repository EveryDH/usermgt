package com.usermgt.infrastructure.po;

import lombok.Data;

/**
 * @author hao.dai
 * @date 2019/8/18
 */
@Data
public class UserPO {
//    用户姓名、邮箱地址、注册地址、地区、ip地址、注册时间、登录时间
    private Integer id;

    private String userName;

    private String eMail;

    private String registerAddress;

    private String district;

    private String ip;

    private String registerTime;

    private String loginTime;

}
