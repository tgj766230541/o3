package com.o3gene.dao;

import com.o3gene.beans.MidOrdersGoodsKey;

public interface MidOrdersGoodsMapper {
    int deleteByPrimaryKey(MidOrdersGoodsKey key);

    int insert(MidOrdersGoodsKey record);

    int insertSelective(MidOrdersGoodsKey record);
}