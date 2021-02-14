package com.amey.beans;

public class Emp {
	private int STUNO;
	private String STUDENT_NAME;
	private String STUDENT_DOB;
	private String STUDENT_DOJ;
	public int getSTUNO() {
		return STUNO;
	}
	public void setSTUNO(int sTUNO) {
		STUNO = sTUNO;
	}
	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}
	public void setSTUDENT_NAME(String sTUDENT_NAME) {
		STUDENT_NAME = sTUDENT_NAME;
	}
	public String getSTUDENT_DOB() {
		return STUDENT_DOB;
	}
	public void setSTUDENT_DOB(String sTUDENT_DOB) {
		STUDENT_DOB = sTUDENT_DOB;
	}
	public String getSTUDENT_DOJ() {
		return STUDENT_DOJ;
	}
	public void setSTUDENT_DOJ(String sTUDENT_DOJ) {
		STUDENT_DOJ = sTUDENT_DOJ;
	}
	@Override
	public String toString() {
		return "Emp [STUNO=" + STUNO + ", STUDENT_NAME=" + STUDENT_NAME + ", STUDENT_DOB=" + STUDENT_DOB
				+ ", STUDENT_DOJ=" + STUDENT_DOJ + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
