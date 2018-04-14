package com.o3gene.dao;

import com.o3gene.beans.GoodsClass;

public interface GoodsClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsClass record);

    int insertSelective(GoodsClass record);

    GoodsClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsClass record);

    int updateByPrimaryKey(GoodsClass record);
}