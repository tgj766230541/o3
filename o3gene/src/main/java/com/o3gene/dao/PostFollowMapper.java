package com.o3gene.dao;

import com.o3gene.beans.PostFollow;

public interface PostFollowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PostFollow record);

    int insertSelective(PostFollow record);

    PostFollow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PostFollow record);

    int updateByPrimaryKey(PostFollow record);
}