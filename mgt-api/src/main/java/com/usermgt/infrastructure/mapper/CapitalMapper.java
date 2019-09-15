package com.usermgt.infrastructure.mapper;

import com.usermgt.infrastructure.po.CapitalPO;
import com.usermgt.infrastructure.po.UserPO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/9/15
 */
public interface CapitalMapper extends Mapper<CapitalPO>, MySqlMapper<CapitalPO> {
    List<CapitalPO> selectByExample(CapitalPO capital, Example example);

}
