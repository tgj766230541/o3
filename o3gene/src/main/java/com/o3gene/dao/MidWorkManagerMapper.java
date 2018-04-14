package com.o3gene.dao;

import com.o3gene.beans.MidWorkManagerKey;

public interface MidWorkManagerMapper {
    int deleteByPrimaryKey(MidWorkManagerKey key);

    int insert(MidWorkManagerKey record);

    int insertSelective(MidWorkManagerKey record);
}