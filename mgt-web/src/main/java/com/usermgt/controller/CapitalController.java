package com.usermgt.controller;

import com.usermgt.infrastructure.po.CapitalPO;
import com.usermgt.service.CapitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/9/15
 */

@Api(description = "API", tags = "/capital")
@RestController
@RequestMapping(path = "/capital", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class CapitalController {

    @Autowired
    CapitalService capitalService;

    @PostMapping("/getCapitalByUserNameAndNativePlace")
    @ApiOperation(value = "根据用户名 与 籍贯查询内容")
    public List<CapitalPO> getCapitalByUserNameAndNativePlace(String userName, String nativePlace){
        return capitalService.selectCapitalByUserNameAndNativePlace(userName, nativePlace);
    }
}
