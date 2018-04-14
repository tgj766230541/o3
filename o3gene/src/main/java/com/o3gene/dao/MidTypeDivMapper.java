package com.o3gene.dao;

import com.o3gene.beans.MidTypeDivKey;

public interface MidTypeDivMapper {
    int deleteByPrimaryKey(MidTypeDivKey key);

    int insert(MidTypeDivKey record);

    int insertSelective(MidTypeDivKey record);
}