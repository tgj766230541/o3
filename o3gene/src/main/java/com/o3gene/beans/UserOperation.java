package com.o3gene.beans;

public class UserOperation {
    private Integer id;

    private Integer userId;

    private Integer type;

    private String descOne;

    private String descTwo;

    private String descThree;

    private Integer valueOne;

    private Integer valueTwo;

    private Integer manageSta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescOne() {
        return descOne;
    }

    public void setDescOne(String descOne) {
        this.descOne = descOne == null ? null : descOne.trim();
    }

    public String getDescTwo() {
        return descTwo;
    }

    public void setDescTwo(String descTwo) {
        this.descTwo = descTwo == null ? null : descTwo.trim();
    }

    public String getDescThree() {
        return descThree;
    }

    public void setDescThree(String descThree) {
        this.descThree = descThree == null ? null : descThree.trim();
    }

    public Integer getValueOne() {
        return valueOne;
    }

    public void setValueOne(Integer valueOne) {
        this.valueOne = valueOne;
    }

    public Integer getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(Integer valueTwo) {
        this.valueTwo = valueTwo;
    }

    public Integer getManageSta() {
        return manageSta;
    }

    public void setManageSta(Integer manageSta) {
        this.manageSta = manageSta;
    }

	@Override
	public String toString() {
		return "UserOperation [id=" + id + ", userId=" + userId + ", type=" + type + ", descOne=" + descOne
				+ ", descTwo=" + descTwo + ", descThree=" + descThree + ", valueOne=" + valueOne + ", valueTwo="
				+ valueTwo + ", manageSta=" + manageSta + "]";
	}
}