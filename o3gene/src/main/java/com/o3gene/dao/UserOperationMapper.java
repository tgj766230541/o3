package com.o3gene.dao;

import com.o3gene.beans.UserOperation;

public interface UserOperationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOperation record);

    int insertSelective(UserOperation record);

    UserOperation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserOperation record);

    int updateByPrimaryKey(UserOperation record);
}