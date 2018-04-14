package com.o3gene.beans;

public class ShowHtml {
    private Integer id;

    private String title;

    private String desc;

    private String keyWord;

    private String src;

    private Integer layer;

    private Integer sta;

    private Integer manageSta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
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
		return "ShowHtml [id=" + id + ", title=" + title + ", desc=" + desc + ", keyWord=" + keyWord + ", src=" + src
				+ ", layer=" + layer + ", sta=" + sta + ", manageSta=" + manageSta + "]";
	}
}