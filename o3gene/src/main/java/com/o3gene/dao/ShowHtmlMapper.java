package com.o3gene.dao;

import com.o3gene.beans.ShowHtml;

public interface ShowHtmlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShowHtml record);

    int insertSelective(ShowHtml record);

    ShowHtml selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShowHtml record);

    int updateByPrimaryKey(ShowHtml record);
}