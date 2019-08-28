package com.usermgt.service;

import com.usermgt.infrastructure.po.UserPO;

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/8/16
 */
public interface UserService {

    int insertUser(UserPO userPO);

    int deleteUserById(Integer userId);

    int updateUserByExample(UserPO userPO);

    List<UserPO> selectUserAll();

    UserPO selectByName(String username);

}