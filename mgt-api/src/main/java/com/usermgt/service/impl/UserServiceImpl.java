package com.usermgt.service.impl;
import com.usermgt.infrastructure.mapper.UserMapper;
import com.usermgt.infrastructure.po.UserPO;
import com.usermgt.service.UserService;
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
    public int insertUser(UserPO UserPO) {
        return userMapper.insert(UserPO);
    }

    @Override
    public int deleteUserById(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int updateUserByExample(UserPO UserPO) {
        Example example = Example.builder(UserPO.class).build();
        example.and().andEqualTo("id", UserPO.getId());
        return userMapper.updateByExample(UserPO,example);
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
