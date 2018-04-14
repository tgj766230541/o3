package com.o3gene.beans;

public class MidOrdersGoodsKey {
    private Integer ordersId;

    private Integer goodsdtlId;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getGoodsdtlId() {
        return goodsdtlId;
    }

    public void setGoodsdtlId(Integer goodsdtlId) {
        this.goodsdtlId = goodsdtlId;
    }

	@Override
	public String toString() {
		return "MidOrdersGoodsKey [ordersId=" + ordersId + ", goodsdtlId=" + goodsdtlId + "]";
	}
}