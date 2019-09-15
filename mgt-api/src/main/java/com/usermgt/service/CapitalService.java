package com.usermgt.service;

import com.usermgt.infrastructure.po.CapitalPO;

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/9/15
 */
public interface CapitalService {

    List<CapitalPO> selectCapitalByUserNameAndNativePlace(String userName, String nativePlace);
}
