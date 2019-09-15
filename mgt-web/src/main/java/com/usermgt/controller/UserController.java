package com.usermgt.controller;

import com.usermgt.infrastructure.po.UserPO;
import com.usermgt.request.vo.CommonReturnType;
import com.usermgt.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @ApiOperation(value = "添加")
    public CommonReturnType saveUser(UserPO UserPO) {
        Date date = new Date();
        UserPO.setLoginTime(date);
        UserPO.setRegisterTime(date);
        int ret = userService.insertUser(UserPO);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/deleteUser")
    @ApiOperation(value = "根据 用户id删除用户信息")
    public CommonReturnType deleteUserById(Integer userId) {
        int ret = userService.deleteUserById(userId);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @PostMapping("/updateUserInfo")
    @ApiOperation(value = "根据 用户id修改用户信息")
    public CommonReturnType updateUserInfo(@RequestParam Integer id) {
        UserPO userPO = new UserPO();
        userPO.setId(id);
        int ret = userService.updateUserByExample(userPO);
        return new CommonReturnType<>(true,"请求成功",ret);
    }

    @GetMapping("/getUserAll")
    @ApiOperation(value = "获取所有的个人信息")
    public CommonReturnType getUserAll(int pageIndex, int pageSize) {
        List<UserPO> users = userService.selectUserAll(pageIndex,pageSize);
        return new CommonReturnType<>(true,"请求成功",users);
    }

    @GetMapping("/getUserInfo")
    @ApiOperation(value = "获取 用户个人信息详细")
        public CommonReturnType getUserInfo(@RequestParam Integer userId) {
        UserPO user = userService.selectUserInfoByUserId(userId);
        return new CommonReturnType<>(true,"请求成功",user);
    }

    @GetMapping("/index")
    @ApiOperation(value = "index")
    public String index() {
        return "index";
    }
}
