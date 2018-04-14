package com.o3gene.beans;

public class MidWorkManagerKey {
    private Integer workOrderId;

    private Integer userId;

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "MidWorkManagerKey [workOrderId=" + workOrderId + ", userId=" + userId + "]";
	}
}