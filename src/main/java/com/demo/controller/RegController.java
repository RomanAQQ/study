package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.RegService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"用户接口"})
@RestController
@RequestMapping("user")
public class RegController {
    @Autowired
    private RegService regService;


    @RequestMapping("/select")
    @ApiOperation(value = "寻找用户")
    public User select(@ApiParam(value = "寻找用户参数",required = true) @RequestParam(value = "id") Integer id) {
        User list = regService.select(id);
        return list;
    }

    @RequestMapping("/register")
    @ApiOperation(value = "注册用户")
    public String insert(@ApiParam(value = "新增用户参数",required = true) User user) {
        //System.out.println(user.getUsername() + "+" + user.getPassword() + "+" + user.getAge());
        regService.insert(user);
        return "success";
    }

    @RequestMapping("/find")
    @ApiOperation(value = "查询用户")
    public User findByUserName(@ApiParam(value = "查询用户参数",required = true) @RequestParam(value = "userName") String userName) {

        User user = regService.findByUserName(userName);
        return user;
    }
}
