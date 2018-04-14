package com.o3gene.beans;

import java.util.Date;

public class WorkOrderdtl {
    private Integer id;

    private Integer workOrderId;

    private Integer auther;

    private Date date;

    private String chat;

    private String managerOperation;

    private Integer manageSta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getAuther() {
        return auther;
    }

    public void setAuther(Integer auther) {
        this.auther = auther;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat == null ? null : chat.trim();
    }

    public String getManagerOperation() {
        return managerOperation;
    }

    public void setManagerOperation(String managerOperation) {
        this.managerOperation = managerOperation == null ? null : managerOperation.trim();
    }

    public Integer getManageSta() {
        return manageSta;
    }

    public void setManageSta(Integer manageSta) {
        this.manageSta = manageSta;
    }

	@Override
	public String toString() {
		return "WorkOrderdtl [id=" + id + ", workOrderId=" + workOrderId + ", auther=" + auther + ", date=" + date
				+ ", chat=" + chat + ", managerOperation=" + managerOperation + ", manageSta=" + manageSta + "]";
	}
}