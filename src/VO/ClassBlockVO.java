package VO;

import java.io.Serializable;

public class ClassBlockVO implements Serializable{

	private int classBlockId;
	private String classBlockTitle;
	private String classBlockSize;
	private String classBlockDescription;
	private ExamVO examVO;
	private ClassVo classVo;
	
	public int getClassBlockId() {
		return classBlockId;
	}
	public void setClassBlockId(int classBlockId) {
		this.classBlockId = classBlockId;
	}
	
		
	public String getClassBlockTitle() {
		return classBlockTitle;
	}
	public void setClassBlockTitle(String classBlockTitle) {
		this.classBlockTitle = classBlockTitle;
	}
	
	
	
	public String getClassBlockSize() {
		return classBlockSize;
	}
	public void setClassBlockSize(String classBlockSize) {
		this.classBlockSize = classBlockSize;
	}
	
	
	
	public String getClassBlockDescription() {
		return classBlockDescription;
	}
	public void setClassBlockDescription(String classBlockDescription) {
		this.classBlockDescription = classBlockDescription;
	}

	
	
	public ExamVO getExamVO() {
		return examVO;
	}
	public void setExamVO(ExamVO examVO) {
		this.examVO = examVO;
	}
	public ClassVo getClassVo() {
		return classVo;
	}
	public void setClassVo(ClassVo classVo) {
		this.classVo = classVo;
	}
}
