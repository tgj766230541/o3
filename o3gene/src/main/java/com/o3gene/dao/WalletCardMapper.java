package com.o3gene.dao;

import com.o3gene.beans.WalletCard;

public interface WalletCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WalletCard record);

    int insertSelective(WalletCard record);

    WalletCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WalletCard record);

    int updateByPrimaryKey(WalletCard record);
}