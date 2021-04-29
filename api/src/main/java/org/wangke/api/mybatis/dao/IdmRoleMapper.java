package org.wangke.api.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.wangke.api.mybatis.entity.IdmRole;
import org.wangke.api.mybatis.entity.IdmRoleExample;

import java.util.List;
@Mapper
public interface IdmRoleMapper {
    long countByExample(IdmRoleExample example);

    int deleteByExample(IdmRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(IdmRole record);

    int insertSelective(IdmRole record);

    List<IdmRole> selectByExample(IdmRoleExample example);

    IdmRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") IdmRole record, @Param("example") IdmRoleExample example);

    int updateByExample(@Param("record") IdmRole record, @Param("example") IdmRoleExample example);

    int updateByPrimaryKeySelective(IdmRole record);

    int updateByPrimaryKey(IdmRole record);
}