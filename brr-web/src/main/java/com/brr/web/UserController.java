package com.brr.web;

import com.alibaba.fastjson.JSON;
import com.brr.model.User;
import com.brr.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hxp
 * @date: 2019/5/8 14:27
 * @description:
 */
@Api(value = "用户信息",tags = "用户管理")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "selectUser",notes = "查询用户")
    @RequestMapping(value = "/selectUser",method = RequestMethod.GET)
    public String selectUser(){
        User user = userService.selectUser();

        return JSON.toJSONString(user);
    }
}
