package com.o3gene.dao;

import com.o3gene.beans.ShowDiv;

public interface ShowDivMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShowDiv record);

    int insertSelective(ShowDiv record);

    ShowDiv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShowDiv record);

    int updateByPrimaryKey(ShowDiv record);
}