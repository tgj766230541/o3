package com.o3gene.dao;

import com.o3gene.beans.MidCouponWalletKey;

public interface MidCouponWalletMapper {
    int deleteByPrimaryKey(MidCouponWalletKey key);

    int insert(MidCouponWalletKey record);

    int insertSelective(MidCouponWalletKey record);
}