package com.o3gene.beans;

public class MidGradeClassKey {
    private Integer showGradeId;

    private Integer classId;

    public Integer getShowGradeId() {
        return showGradeId;
    }

    public void setShowGradeId(Integer showGradeId) {
        this.showGradeId = showGradeId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

	@Override
	public String toString() {
		return "MidGradeClassKey [showGradeId=" + showGradeId + ", classId=" + classId + "]";
	}
}