package org.wangke.api.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class IdmUserRole implements Serializable {
    private Integer mapId;

    private Integer userId;

    private Integer roleId;

    private Integer createBy;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public IdmUserRole(Integer mapId, Integer userId, Integer roleId, Integer createBy, Date createTime) {
        this.mapId = mapId;
        this.userId = userId;
        this.roleId = roleId;
        this.createBy = createBy;
        this.createTime = createTime;
    }

    public IdmUserRole() {
        super();
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mapId=").append(mapId);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}