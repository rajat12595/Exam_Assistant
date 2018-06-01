package VO;

public class FacultyVO {
	
	private int facultyId;
	private AddProfessorVO addProfessorVO;
	private ExamVO examVO;
	private ClassBlockVO classBlockVO;
	
	
	
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public AddProfessorVO getAddProfessorVO() {
		return addProfessorVO;
	}
	public void setAddProfessorVO(AddProfessorVO addProfessorVO) {
		this.addProfessorVO = addProfessorVO;
	}
	public ExamVO getExamVO() {
		return examVO;
	}
	public void setExamVO(ExamVO examVO) {
		this.examVO = examVO;
	}
	public ClassBlockVO getClassBlockVO() {
		return classBlockVO;
	}
	public void setClassBlockVO(ClassBlockVO classBlockVO) {
		this.classBlockVO = classBlockVO;
	}
	
	
}
