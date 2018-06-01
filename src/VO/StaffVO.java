package VO;

import java.io.Serializable;

public class StaffVO implements Serializable{

	private int staffId;
	private String staffName;
	private String staffDateOfBirth;
	private String staffGender;
	private String staffPosition;
	private String staffEmail;
	private String staffPhone;
	private String staffPassword;
	private BranchVO branchVO;
	
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDateOfBirth() {
		return staffDateOfBirth;
	}
	public void setStaffDateOfBirth(String staffDateOfBirth) {
		this.staffDateOfBirth = staffDateOfBirth;
	}
	public String getStaffGender() {
		return staffGender;
	}
	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}
	public String getStaffPosition() {
		return staffPosition;
	}
	public void setStaffPosition(String staffPosition) {
		this.staffPosition = staffPosition;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public String getStaffPhone() {
		return staffPhone;
	}
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	public BranchVO getBranchVO() {
		return branchVO;
	}
	public void setBranchVO(BranchVO branchVO) {
		this.branchVO = branchVO;
	}
	
	
	
}
