package com.o3gene.beans;


public class User {
	
    private Integer id;

    private String phonum;

    private String passWord;

    private String nickName;

    private String headIcon;

    private Integer userTypeId;

    private Integer showGradeId;

    private Integer sta;

    private Integer manageSta;
    
    private String i18n;
    
    private String intro;

    public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getI18n() {
		return i18n;
	}

	public void setI18n(String i18n) {
		this.i18n = i18n;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonum() {
        return phonum;
    }

    public void setPhonum(String phonum) {
        this.phonum = phonum == null ? null : phonum.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon == null ? null : headIcon.trim();
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getShowGradeId() {
        return showGradeId;
    }

    public void setShowGradeId(Integer showGradeId) {
        this.showGradeId = showGradeId;
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
		return "User [id=" + id + ", phonum=" + phonum + ", passWord=" + passWord + ", nickName=" + nickName
				+ ", headIcon=" + headIcon + ", userTypeId=" + userTypeId + ", showGradeId=" + showGradeId + ", sta="
				+ sta + ", manageSta=" + manageSta + ", i18n=" + i18n + ", intro=" + intro + "]";
	}

}