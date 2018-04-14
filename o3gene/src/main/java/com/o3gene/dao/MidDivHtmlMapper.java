package com.o3gene.dao;

import com.o3gene.beans.MidDivHtmlKey;

public interface MidDivHtmlMapper {
    int deleteByPrimaryKey(MidDivHtmlKey key);

    int insert(MidDivHtmlKey record);

    int insertSelective(MidDivHtmlKey record);
}