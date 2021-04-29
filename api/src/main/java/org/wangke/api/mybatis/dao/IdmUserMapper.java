package org.wangke.api.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.wangke.api.mybatis.entity.IdmUser;
import org.wangke.api.mybatis.entity.IdmUserExample;

import java.util.List;
@Mapper
public interface IdmUserMapper {
    long countByExample(IdmUserExample example);

    int deleteByExample(IdmUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(IdmUser record);

    int insertSelective(IdmUser record);

    List<IdmUser> selectByExample(IdmUserExample example);

    IdmUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") IdmUser record, @Param("example") IdmUserExample example);

    int updateByExample(@Param("record") IdmUser record, @Param("example") IdmUserExample example);

    int updateByPrimaryKeySelective(IdmUser record);

    int updateByPrimaryKey(IdmUser record);
}