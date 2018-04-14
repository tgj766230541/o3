package com.o3gene.beans;

import java.util.Date;

public class WalletCoupon {
    private Integer id;

    private String couponName;

    private Integer type;

    private Integer discount;

    private Date startDate;

    private Date endDate;

    private String goodsScope;

    private String addressScope;

    private String userScope;

    private Integer sta;

    private Integer manageSta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getGoodsScope() {
        return goodsScope;
    }

    public void setGoodsScope(String goodsScope) {
        this.goodsScope = goodsScope == null ? null : goodsScope.trim();
    }

    public String getAddressScope() {
        return addressScope;
    }

    public void setAddressScope(String addressScope) {
        this.addressScope = addressScope == null ? null : addressScope.trim();
    }

    public String getUserScope() {
        return userScope;
    }

    public void setUserScope(String userScope) {
        this.userScope = userScope == null ? null : userScope.trim();
    }

    public Integer getSta() {
        return sta;
    }

    public void setSta(Integer sta) {
        this.sta = sta;
    }

    public Integer getManageSta() {
        return manageSta;
    }

    public void setManageSta(Integer manageSta) {
        this.manageSta = manageSta;
    }

	@Override
	public String toString() {
		return "WalletCoupon [id=" + id + ", couponName=" + couponName + ", type=" + type + ", discount=" + discount
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", goodsScope=" + goodsScope + ", addressScope="
				+ addressScope + ", userScope=" + userScope + ", sta=" + sta + ", manageSta=" + manageSta + "]";
	}
}