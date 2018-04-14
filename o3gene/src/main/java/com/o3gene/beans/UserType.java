package com.o3gene.beans;

public class UserType {
    private Integer id;

    private String userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

	@Override
	public String toString() {
		return "UserType [id=" + id + ", userType=" + userType + "]";
	}
}