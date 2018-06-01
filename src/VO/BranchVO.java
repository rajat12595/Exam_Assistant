package VO;

import java.io.Serializable;

public class BranchVO implements Serializable{
	
	private int branchId;
	private String branchName;
	private String branchDes;
	private Long branchCode; 
	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchDes() {
		return branchDes;
	}
	public void setBranchDes(String branchDes) {
		this.branchDes = branchDes;
	}
	public Long getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(Long branchCode) {
		this.branchCode = branchCode;
	}
	

}
