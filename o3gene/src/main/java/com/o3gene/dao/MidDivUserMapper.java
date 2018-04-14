package com.o3gene.dao;

import com.o3gene.beans.MidDivUserKey;

public interface MidDivUserMapper {
    int deleteByPrimaryKey(MidDivUserKey key);

    int insert(MidDivUserKey record);

    int insertSelective(MidDivUserKey record);
}