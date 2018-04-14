package com.o3gene.beans;

public class Post {
    private Integer id;

    private Integer userId;

    private String title;

    private String digest;

    private String pageSrc;

    private Integer sta;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public String getPageSrc() {
        return pageSrc;
    }

    public void setPageSrc(String pageSrc) {
        this.pageSrc = pageSrc == null ? null : pageSrc.trim();
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
		return "Post [id=" + id + ", userId=" + userId + ", title=" + title + ", digest=" + digest + ", pageSrc="
				+ pageSrc + ", sta=" + sta + ", manageSta=" + manageSta + "]";
	}
}