package org.wangke.api.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.wangke.api.mybatis.entity.IdmUserRole;
import org.wangke.api.mybatis.entity.IdmUserRoleExample;

import java.util.List;
@Mapper
public interface IdmUserRoleMapper {
    long countByExample(IdmUserRoleExample example);

    int deleteByExample(IdmUserRoleExample example);

    int deleteByPrimaryKey(Integer mapId);

    int insert(IdmUserRole record);

    int insertSelective(IdmUserRole record);

    List<IdmUserRole> selectByExample(IdmUserRoleExample example);

    IdmUserRole selectByPrimaryKey(Integer mapId);

    int updateByExampleSelective(@Param("record") IdmUserRole record, @Param("example") IdmUserRoleExample example);

    int updateByExample(@Param("record") IdmUserRole record, @Param("example") IdmUserRoleExample example);

    int updateByPrimaryKeySelective(IdmUserRole record);

    int updateByPrimaryKey(IdmUserRole record);
}