package com.usermgt.service.impl;

import com.usermgt.infrastructure.mapper.CapitalMapper;
import com.usermgt.infrastructure.po.CapitalPO;
import com.usermgt.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/9/15
 */
public class CapitalServiceImpl implements CapitalService {

    @Autowired
    CapitalMapper capitalMapper;

    @Override
    public List<CapitalPO> selectCapitalByUserNameAndNativePlace(String userName, String nativePlace) {
        CapitalPO capital= new CapitalPO();
        capital.setName(userName);
        capital.setNativePlace(nativePlace);

        Example example = Example.builder(CapitalPO.class).build();
        example.and().andEqualTo("name", capital.getName());
        example.and().andEqualTo("nativePlace", capital.getNativePlace());
        return capitalMapper.selectByExample(capital,example);
    }

}
