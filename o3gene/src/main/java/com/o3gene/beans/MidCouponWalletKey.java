package com.o3gene.beans;

public class MidCouponWalletKey {
    private Integer couponId;

    private Integer wallet;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getWallet() {
        return wallet;
    }

    public void setWallet(Integer wallet) {
        this.wallet = wallet;
    }

	@Override
	public String toString() {
		return "MidCouponWalletKey [couponId=" + couponId + ", wallet=" + wallet + "]";
	}
}