package com.o3gene.beans;

public class MidDivUserKey {
    private Integer divId;

    private Integer userId;

    public Integer getDivId() {
        return divId;
    }

    public void setDivId(Integer divId) {
        this.divId = divId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "MidDivUserKey [divId=" + divId + ", userId=" + userId + "]";
	}
}