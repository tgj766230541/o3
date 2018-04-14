package com.o3gene.dao;

import com.o3gene.beans.GoodsModel;

public interface GoodsModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsModel record);

    int insertSelective(GoodsModel record);

    GoodsModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsModel record);

    int updateByPrimaryKey(GoodsModel record);
}