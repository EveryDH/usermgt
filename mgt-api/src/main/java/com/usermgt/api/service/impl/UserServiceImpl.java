package com.usermgt.api.service.impl;
import com.usermgt.api.infrastructure.dao.UserMapper;
import com.usermgt.api.infrastructure.po.UserPO;
import com.usermgt.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/8/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insertUser(UserPO userPO) {
        return userMapper.insert(userPO);
    }

    @Override
    public int deleteUserById(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int updateUserByExample(UserPO userPO) {
        Example example = Example.builder(UserPO.class).build();
        example.and().andEqualTo("id", userPO.getId());
        return userMapper.updateByExample(userPO,example);
    }

    @Override
    public List<UserPO> selectUserAll() {
        return userMapper.selectAll();
    }

    @Override
    public UserPO selectByName(String username) {
        return null;
    }
}
