package com.o3gene.beans;

public class MidDivHtmlKey {
    private Integer divId;

    private Integer htmlId;

    public Integer getDivId() {
        return divId;
    }

    public void setDivId(Integer divId) {
        this.divId = divId;
    }

    public Integer getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(Integer htmlId) {
        this.htmlId = htmlId;
    }

	@Override
	public String toString() {
		return "MidDivHtmlKey [divId=" + divId + ", htmlId=" + htmlId + "]";
	}
}