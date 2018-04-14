package com.o3gene.beans;

public class GoodsModel {
    private Integer id;

    private Integer goodsdtlId;

    private String imageSrc;

    private String desc;

    private Double brand;

    private Integer sta;

    private Integer manageSta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsdtlId() {
        return goodsdtlId;
    }

    public void setGoodsdtlId(Integer goodsdtlId) {
        this.goodsdtlId = goodsdtlId;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc == null ? null : imageSrc.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Double getBrand() {
        return brand;
    }

    public void setBrand(Double brand) {
        this.brand = brand;
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
		return "GoodsModel [id=" + id + ", goodsdtlId=" + goodsdtlId + ", imageSrc=" + imageSrc + ", desc=" + desc
				+ ", brand=" + brand + ", sta=" + sta + ", manageSta=" + manageSta + "]";
	}
}