package com.o3gene.dao;

import com.o3gene.beans.ForumUser;

public interface ForumUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ForumUser record);

    int insertSelective(ForumUser record);

    ForumUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ForumUser record);

    int updateByPrimaryKey(ForumUser record);
}