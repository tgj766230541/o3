package com.o3gene.dao;

import com.o3gene.beans.Post;

public interface PostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}