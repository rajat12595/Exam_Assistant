package VO;

import java.io.Serializable;

public class ClassVo implements Serializable {
	
	private int classId;
	private int classNumber;
	private String classDes;
	private int classFloor;
	private int classCapacity;
	
	public int getClassFloor() {
		return classFloor;
	}
	public void setClassFloor(int classFloor) {
		this.classFloor = classFloor;
	}
	public String getClassDes() {
		return classDes;
	}
	public void setClassDes(String classDes) {
		this.classDes = classDes;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getClassCapacity() {
		return classCapacity;
	}
	public void setClassCapacity(int classCapacity) {
		this.classCapacity = classCapacity;
	}

}
