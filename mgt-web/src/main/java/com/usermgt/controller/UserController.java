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

import java.util.List;

/**
 * @author hao.dai
 * @date 2019/8/18
 */
@Api(description = "API", tags = "/user")
@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    @ApiOperation(value = "save user")
    public CommonReturnType saveUser(UserPO userPO) {
        int ret = userService.insertUser(userPO);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/deleteUser")
    @ApiOperation(value = "delete user")
    public CommonReturnType deleteUserById(Integer userId) {
        int ret = userService.deleteUserById(userId);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/updateUser")
    @ApiOperation(value = "update user by id")
    public CommonReturnType updateUser(UserPO userPO) {
        int ret = userService.updateUserByExample(userPO);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/getUserAll")
    @ApiOperation(value = "get user all")
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
