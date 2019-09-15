package com.usermgt.service.impl;
import com.usermgt.infrastructure.mapper.UserMapper;
import com.usermgt.infrastructure.po.UserPO;
import com.usermgt.service.UserService;
import org.apache.ibatis.session.RowBounds;
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
    public int updateUserByExample(UserPO userPO) {
        Example example = Example.builder(UserPO.class).build();
        example.and().andEqualTo("id", userPO.getId());
        return userMapper.updateByExample(userPO,example);
    }

    @Override
    public List<UserPO> selectUserAll(int pageIndex, int pageSize) {
        Example example = Example.builder(UserPO.class).build();
        return userMapper.selectByExampleAndRowBounds(example, new RowBounds((pageIndex - 1) * pageSize, pageSize));
    }

    @Override
    public UserPO selectUserInfoByUserId(Integer userId) {
        Example example = Example.builder(UserPO.class).build();
        example.and().andEqualTo("id",userId);
        return userMapper.selectByPrimaryKey(example);
    }

    @Override
    public UserPO selectByName(String username) {
        return null;
    }
}
