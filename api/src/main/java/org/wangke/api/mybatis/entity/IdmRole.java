package org.wangke.api.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class IdmRole implements Serializable {
    private Integer roleId;

    private String roleCode;

    private String roleDesc;

    private Integer objectVersionNumber;

    private Integer updateBy;

    private Date updateTime;

    private Integer createBy;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public IdmRole(Integer roleId, String roleCode, String roleDesc, Integer objectVersionNumber, Integer updateBy, Date updateTime, Integer createBy, Date createTime) {
        this.roleId = roleId;
        this.roleCode = roleCode;
        this.roleDesc = roleDesc;
        this.objectVersionNumber = objectVersionNumber;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.createTime = createTime;
    }

    public IdmRole() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Integer objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", roleId=").append(roleId);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleDesc=").append(roleDesc);
        sb.append(", objectVersionNumber=").append(objectVersionNumber);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}