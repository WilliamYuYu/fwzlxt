package com.pengesoft.fwzlxt.domain;

import pengesoft.data.*;

/**
 * 用户信息 的摘要说明。
 *
 * @auther: 向朗.
 * @date: 2019-11-26 13:15:37.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class UserInfo extends DataPacket {

    //用户Id.
    private String userId;
    //用户名.
    private String userName;
    //证件号码.
    private String idCard;
    //性别.
    private int sex;
    //电话.
    private String phone;

    /**
     * 获取 用户Id.
     * @return 用户Id.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户Id.
     * @param userId 用户Id.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取 用户名.
     * @return 用户名.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名.
     * @param userName 用户名.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 证件号码.
     * @return 证件号码.
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置证件号码.
     * @param idCard 证件号码.
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取 性别.
     * @return 性别.
     */
    public int getSex() {
        return sex;
    }

    /**
     * 设置性别.
     * @param sex 性别.
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * 获取 电话.
     * @return 电话.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话.
     * @param phone 电话.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * 清空对象
     */
    @Override
    public void clear() {
        super.clear();
        this.userId = null;
        this.userName = null;
        this.idCard = null;
        this.sex = 0;
        this.phone = null;
    }

    /**
     * 复制对象（深复制）
     *
     * @param sou 被复制的对象
     */
    @Override
    public void assignFrom(DataPacket sou) {
        super.assignFrom(sou);
        UserInfo s = (sou instanceof UserInfo) ? (UserInfo)sou : null;
        if (s != null){
            this.userId = s.userId;
            this.userName = s.userName;
            this.idCard = s.idCard;
            this.sex = s.sex;
            this.phone = s.phone;
        }
    }

    @Override
    public String toString() {
        return this.getJsonText();
    }
}


