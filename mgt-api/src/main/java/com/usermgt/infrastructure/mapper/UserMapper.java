package com.usermgt.infrastructure.mapper;


import com.usermgt.infrastructure.po.UserPO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author hao.dai
 * @date 2019/8/18
 */
public interface UserMapper extends Mapper<UserPO>, MySqlMapper<UserPO> {
}
