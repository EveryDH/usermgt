package com.usermgt.service;

import com.usermgt.infrastructure.po.UserPO;

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/8/16
 */
public interface UserService {

    int insertUser(UserPO UserPO);

    int deleteUserById(Integer userId);

    int updateUserByExample(UserPO UserPO);

    List<UserPO> selectUserAll(int pageIndex, int pageSize);

    UserPO selectByName(String username);

    UserPO selectUserInfoByUserId(Integer userId);
}