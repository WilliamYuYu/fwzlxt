package com.pengesoft.fwzlxt.domain;

import pengesoft.db.*;
import java.util.Collection;

/**
 * 用户列表 的摘要说明。
 *
 * @auther: 向朗.
 * @date: 2019-11-26 13:15:37.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaListAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class UserInfoList extends QueryDataList<UserInfo> {

    /**
     * 默认构造方法
     */
    public UserInfoList() {
        super();
    }
    
    /**
     * 通过已存在集合构造列表
     *
     * @param c 已存在的集合
     */
    public UserInfoList(Collection<UserInfo> c) {
        super(c);
    }

}

