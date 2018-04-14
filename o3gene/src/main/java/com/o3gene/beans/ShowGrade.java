package com.o3gene.beans;

public class ShowGrade {
    private Integer id;

    private String gradeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

	@Override
	public String toString() {
		return "ShowGrade [id=" + id + ", gradeName=" + gradeName + "]";
	}
}