package com.o3gene.beans;

public class Goodsdtl {
    private Integer id;

    private Integer classId;

    private String goodsName;

    private String title;

    private String desc;

    private String productionArea;

    private String productionAddress;

    private String fromArea;

    private String fromAddress;

    private Integer amout;

    private String imageOne;

    private String imageTwo;

    private String imageThree;

    private String pageSrc;

    private Integer goodsGrade;

    private Integer sta;

    private Integer manageSta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getProductionArea() {
        return productionArea;
    }

    public void setProductionArea(String productionArea) {
        this.productionArea = productionArea == null ? null : productionArea.trim();
    }

    public String getProductionAddress() {
        return productionAddress;
    }

    public void setProductionAddress(String productionAddress) {
        this.productionAddress = productionAddress == null ? null : productionAddress.trim();
    }

    public String getFromArea() {
        return fromArea;
    }

    public void setFromArea(String fromArea) {
        this.fromArea = fromArea == null ? null : fromArea.trim();
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    public Integer getAmout() {
        return amout;
    }

    public void setAmout(Integer amout) {
        this.amout = amout;
    }

    public String getImageOne() {
        return imageOne;
    }

    public void setImageOne(String imageOne) {
        this.imageOne = imageOne == null ? null : imageOne.trim();
    }

    public String getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(String imageTwo) {
        this.imageTwo = imageTwo == null ? null : imageTwo.trim();
    }

    public String getImageThree() {
        return imageThree;
    }

    public void setImageThree(String imageThree) {
        this.imageThree = imageThree == null ? null : imageThree.trim();
    }

    public String getPageSrc() {
        return pageSrc;
    }

    public void setPageSrc(String pageSrc) {
        this.pageSrc = pageSrc == null ? null : pageSrc.trim();
    }

    public Integer getGoodsGrade() {
        return goodsGrade;
    }

    public void setGoodsGrade(Integer goodsGrade) {
        this.goodsGrade = goodsGrade;
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
		return "Goodsdtl [id=" + id + ", classId=" + classId + ", goodsName=" + goodsName + ", title=" + title
				+ ", desc=" + desc + ", productionArea=" + productionArea + ", productionAddress=" + productionAddress
				+ ", fromArea=" + fromArea + ", fromAddress=" + fromAddress + ", amout=" + amout + ", imageOne="
				+ imageOne + ", imageTwo=" + imageTwo + ", imageThree=" + imageThree + ", pageSrc=" + pageSrc
				+ ", goodsGrade=" + goodsGrade + ", sta=" + sta + ", manageSta=" + manageSta + "]";
	}
}