package com.orange.mapper;

import com.orange.javaBean.ConstantItem;

public interface ConstantItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstantItem record);

    int insertSelective(ConstantItem record);

    ConstantItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConstantItem record);

    int updateByPrimaryKey(ConstantItem record);
}