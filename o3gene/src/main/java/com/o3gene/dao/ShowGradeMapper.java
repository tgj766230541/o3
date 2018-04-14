package com.o3gene.dao;

import com.o3gene.beans.ShowGrade;

public interface ShowGradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShowGrade record);

    int insertSelective(ShowGrade record);

    ShowGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShowGrade record);

    int updateByPrimaryKey(ShowGrade record);
}