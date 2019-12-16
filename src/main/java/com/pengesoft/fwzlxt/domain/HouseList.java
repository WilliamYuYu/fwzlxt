package com.pengesoft.fwzlxt.domain;

import pengesoft.db.*;
import java.util.Collection;

/**
 * 房屋列表 的摘要说明。
 *
 * @auther: 余展鹏.
 * @date: 2019/12/13 16:45:25.
 *
 * 文件由鹏业软件模型工具生成(模板名称：JavaListAdv),一般不应直接修改此文件.
 * Copyright (C) 2008 - 鹏业软件公司
 */
public class HouseList extends QueryDataList<House> {

    /**
     * 默认构造方法
     */
    public HouseList() {
        super();
    }

    /**
     * 通过已存在集合构造列表
     *
     * @param c 已存在的集合
     */
    public HouseList(Collection<House> c) {
        super(c);
    }

}
