package com.o3gene.dao;

import com.o3gene.beans.UserType;

public interface UserTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserType record);

    int insertSelective(UserType record);

    UserType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);
}