package com.o3gene.dao;

import com.o3gene.beans.Goodsdtl;

public interface GoodsdtlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsdtl record);

    int insertSelective(Goodsdtl record);

    Goodsdtl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsdtl record);

    int updateByPrimaryKey(Goodsdtl record);
}