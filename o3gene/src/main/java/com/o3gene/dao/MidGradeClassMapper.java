package com.o3gene.dao;

import com.o3gene.beans.MidGradeClassKey;

public interface MidGradeClassMapper {
    int deleteByPrimaryKey(MidGradeClassKey key);

    int insert(MidGradeClassKey record);

    int insertSelective(MidGradeClassKey record);
}