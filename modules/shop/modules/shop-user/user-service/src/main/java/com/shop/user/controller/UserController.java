package com.shop.user.controller;

import com.shop.user.api.model.UserInfo;
import com.shop.user.api.model.base.Rep;
import com.shop.user.api.model.base.Req;
import com.shop.user.api.rest.UserResCtrl;
import com.shop.user.api.rest.UserResource;
import com.shop.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户接口")
@RestController
@RequestMapping(value="/user")
public class UserController implements UserResource,UserResCtrl{

    private static Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    @RequestMapping(value="/getUserInfo",method= RequestMethod.POST)
    public UserInfo getUserInfo(@RequestParam(value = "userId",required = false) Long userId){
        logger.info("UserController getUserInfo start,userId={}",userId);
        if(userId==null) {
            return null;
        }
        return userService.getUserInfo(userId);
    }


    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    @RequestMapping(value="/getUserInfo2",method= RequestMethod.GET)
    public Rep<UserInfo> getUserInfo2(@RequestParam(value = "userId",required = false) Long userId) {
        logger.info("UserController getUserInfo2 start,userId={}",userId);

        Rep<UserInfo> rep= new Rep<UserInfo>();
        if(userId==null) {
            rep.getHeader().setRet("F");
            return rep;
        }
        UserInfo userInfo = userService.getUserInfo(userId);
        rep.setData(userInfo);
        rep.getHeader().setRet("S");
        return rep;
    }

    @ApiOperation(value = "获取用户信息3", notes = "获取用户信息3")
    @RequestMapping(value="/queryUserInfo3",method= RequestMethod.POST)
    public Rep<UserInfo> queryUserInfo3(@RequestBody @Validated Req<Long> req, Errors errors) {
        logger.info("UserController queryUserInfo3 start,req={}",req);
        Long userId =req.getData();
        Rep<UserInfo> rep= new Rep<UserInfo>();
        if(userId==null) {
            rep.getHeader().setRet("F");
            return rep;
        }
        UserInfo userInfo = userService.getUserInfo(userId);
        rep.setData(userInfo);
        rep.getHeader().setRet("S");
        return rep;
    }
}
