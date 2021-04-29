package org.wangke.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wangke.api.common.dto.RestResponse;
import org.wangke.api.common.utils.ResponseUtil;
import org.wangke.api.mybatis.dao.IdmUserMapper;
import org.wangke.api.mybatis.entity.IdmUser;
import org.wangke.api.mybatis.entity.IdmUserExample;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/user")
public class UserBaseController {
    @Autowired
    IdmUserMapper userMapper;

    @PostMapping
    public ResponseEntity create(@RequestBody IdmUser user){
        userMapper.insert(user);
        user.setCreateTime(new Date());
        RestResponse restResponse = ResponseUtil.okResponse("创建成功",user);
        ResponseEntity<IdmUser> response = new ResponseEntity(restResponse,null,HttpStatus.CREATED);

        return response;
    }

    @GetMapping("/list")
    public ResponseEntity query(IdmUser user){
        IdmUserExample example = new IdmUserExample();
        example.createCriteria().andUserNameLike("%"+user.getUserName()+"%").andPhoneEqualTo("187");
        example.or().andPhoneLike(user.getPhone()+"%");

        RestResponse restResponse = ResponseUtil.okResponse("查询成功",userMapper.selectByExample(example));
        return new ResponseEntity(restResponse,null,HttpStatus.OK);
    }
}
