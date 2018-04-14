package com.o3gene.dao;

import com.o3gene.beans.UserReal;

public interface UserRealMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserReal record);

    int insertSelective(UserReal record);

    UserReal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserReal record);

    int updateByPrimaryKey(UserReal record);
}