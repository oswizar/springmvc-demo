/**
 * Copyright (C): 长安新生(深圳)金融投资有限公司
 * FileName: User
 * Author:   xiexing
 * Date:     2019/1/14 13:39
 * Description:
 */
package com.xiexing.entity;

public class User {
    private Integer userId;
    private String userName;
    private String passWord;
    private Address address;

    public User(Integer userId, String userName, String passWord) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
    }

    public User() {
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
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", address=" + address +
                '}';
    }
}
