package com.usermgt.controller;

import com.usermgt.infrastructure.po.UserPO;
import com.usermgt.request.vo.CommonReturnType;
import com.usermgt.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author hao.dai
 * @date 2019/8/18
 */
@Api(description = "API", tags = "/UserPO")
@RestController
@RequestMapping(path = "/UserPO", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    @ApiOperation(value = "save UserPO")
    public CommonReturnType saveUser(UserPO UserPO) {
        Date date = new Date();
        UserPO.setLoginTime(date);
        UserPO.setRegisterTime(date);
        int ret = userService.insertUser(UserPO);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/deleteUser")
    @ApiOperation(value = "delete UserPO")
    public CommonReturnType deleteUserById(Integer userId) {
        int ret = userService.deleteUserById(userId);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/updateUser")
    @ApiOperation(value = "update UserPO by id")
    public CommonReturnType updateUser(UserPO UserPO) {
        int ret = userService.updateUserByExample(UserPO);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/getUserAll")
    @ApiOperation(value = "get UserPO all")
    public CommonReturnType getUserAll() {
        List<UserPO> userPOS = userService.selectUserAll();
        return new CommonReturnType<>(true,"请求成功",userPOS);
    }
    @GetMapping("/index")
    @ApiOperation(value = "index")
    public String index() {
        return "index";
    }
}
