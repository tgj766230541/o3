package com.o3gene.beans;

public class MidGradeGoodsKey {
    private Integer showGradeId;

    private Integer goodsId;

    public Integer getShowGradeId() {
        return showGradeId;
    }

    public void setShowGradeId(Integer showGradeId) {
        this.showGradeId = showGradeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

	@Override
	public String toString() {
		return "MidGradeGoodsKey [showGradeId=" + showGradeId + ", goodsId=" + goodsId + "]";
	}
}