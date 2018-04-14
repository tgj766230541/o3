package com.o3gene.beans;

public class MidTypeDivKey {
    private Integer userTypeId;

    private Integer divId;

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getDivId() {
        return divId;
    }

    public void setDivId(Integer divId) {
        this.divId = divId;
    }

	@Override
	public String toString() {
		return "MidTypeDivKey [userTypeId=" + userTypeId + ", divId=" + divId + "]";
	}
}