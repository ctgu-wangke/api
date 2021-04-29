package org.wangke.api.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wangke.api.common.dto.Count;
import org.wangke.api.common.dto.RestResponse;
import org.wangke.api.common.utils.ResponseUtil;
import org.wangke.api.mybatis.dao.IdmUserMapper;
import org.wangke.api.mybatis.entity.IdmUser;
import org.wangke.api.mybatis.entity.IdmUserExample;

import java.util.Date;

@RestController
@Api(tags = {"swagger 接口测试"})
public class TestController {

    @Autowired
    IdmUserMapper userMapper;

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping  (value = "/hello")
    @ApiOperation(value = "operation hello", notes = "hello ",response = String.class)
    public String hello(String name) {
        logger.info(name);
        logger.debug(name);
        logger.error(name);
        return "hello" + name + "!!!";
    }

    @PostMapping(value = "/test")
    public RestResponse test(@RequestBody Count count){
        logger.info("测试乱码");
        return  ResponseUtil.okResponse("success",count);
    }

    @GetMapping (value = "/user")
    public RestResponse mybatis(){

        IdmUser user = new IdmUser();
        user.setUserName("王可");
        user.setCreateTime(new Date());
        userMapper.insert(user);

        IdmUserExample userExample = new IdmUserExample();
        userExample.getOredCriteria();
        return ResponseUtil.okResponse("success",userMapper.selectByExample(userExample));
    }
}
