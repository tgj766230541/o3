package com.o3gene.dao;

import com.o3gene.beans.WalletCoupon;

public interface WalletCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WalletCoupon record);

    int insertSelective(WalletCoupon record);

    WalletCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WalletCoupon record);

    int updateByPrimaryKey(WalletCoupon record);
}