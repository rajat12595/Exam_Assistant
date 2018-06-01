package VO;

import java.io.Serializable;

public class ExamVO implements Serializable  {

	public int examId;
	private String examTitle;
	private String examDescription;
	private String examDate;
	private String examTimeSlot;
	private BranchVO branchVO;
	private SemesterVO semesterVO;
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamTitle() {
		return examTitle;
	}
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
	public String getExamDescription() {
		return examDescription;
	}
	public void setExamDescription(String examDescription) {
		this.examDescription = examDescription;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getExamTimeSlot() {
		return examTimeSlot;
	}
	public void setExamTimeSlot(String examTimeSlot) {
		this.examTimeSlot = examTimeSlot;
	}
	public BranchVO getBranchVO() {
		return branchVO;
	}
	public void setBranchVO(BranchVO branchVO) {
		this.branchVO = branchVO;
	}
	public SemesterVO getSemesterVO() {
		return semesterVO;
	}
	public void setSemesterVO(SemesterVO semesterVO) {
		this.semesterVO = semesterVO;
	}
}
	
