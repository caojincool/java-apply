package com.shop.user.api.rest;

import com.shop.user.api.model.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Api(value = "用户接口")
@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface UserResource {

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    @GET
    @Path("/getUserInfo")
    public UserInfo getUserInfo(Long userId);
}