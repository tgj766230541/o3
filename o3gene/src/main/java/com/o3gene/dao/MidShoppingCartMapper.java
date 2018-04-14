package com.o3gene.dao;

import com.o3gene.beans.MidShoppingCartKey;

public interface MidShoppingCartMapper {
    int deleteByPrimaryKey(MidShoppingCartKey key);

    int insert(MidShoppingCartKey record);

    int insertSelective(MidShoppingCartKey record);
}