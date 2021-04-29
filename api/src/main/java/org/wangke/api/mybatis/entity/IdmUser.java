package org.wangke.api.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class IdmUser implements Serializable {

    private Integer userId;

    private String userName;

    private String email;

    private String phone;

    private String idCardNumber;

    private String password;

    private String objectVersionNumber;

    private Integer updateBy;

    private Date updateTime;

    private Integer createBy;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public IdmUser(Integer userId, String userName, String email, String phone, String idCardNumber, String password, String objectVersionNumber, Integer updateBy, Date updateTime, Integer createBy, Date createTime) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.idCardNumber = idCardNumber;
        this.password = password;
        this.objectVersionNumber = objectVersionNumber;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.createTime = createTime;
    }

    public IdmUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber == null ? null : idCardNumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(String objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber == null ? null : objectVersionNumber.trim();
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
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", idCardNumber=").append(idCardNumber);
        sb.append(", password=").append(password);
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