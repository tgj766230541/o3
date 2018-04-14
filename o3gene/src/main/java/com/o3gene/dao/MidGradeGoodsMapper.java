package com.o3gene.dao;

import com.o3gene.beans.MidGradeGoodsKey;

public interface MidGradeGoodsMapper {
    int deleteByPrimaryKey(MidGradeGoodsKey key);

    int insert(MidGradeGoodsKey record);

    int insertSelective(MidGradeGoodsKey record);
}