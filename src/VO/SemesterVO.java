package VO;

import java.io.Serializable;

public class SemesterVO implements Serializable{

	private int semId;
	
	private String semName;
	private String semDes;
	private BranchVO branchVO;
	public int getSemId() {
		return semId;
	}
	public void setSemId(int semId) {
		this.semId = semId;
	}
	public String getSemName() {
		return semName;
	}
	public void setSemName(String semName) {
		this.semName = semName;
	}
	public String getSemDes() {
		return semDes;
	}
	public void setSemDes(String semDes) {
		this.semDes = semDes;
	}
	public BranchVO getBranchVO() {
		return branchVO;
	}
	public void setBranchVO(BranchVO branchVO) {
		this.branchVO = branchVO;
	}
	
		
	
}
