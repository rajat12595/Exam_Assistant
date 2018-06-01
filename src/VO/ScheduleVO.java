package VO;

public class ScheduleVO {

	private int scheduleId;
	private AddProfessorVO addProfessorVO;
	private ExamVO examVO;
	private String descreiption;
	
	
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
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
	public String getDescreiption() {
		return descreiption;
	}
	public void setDescreiption(String descreiption) {
		this.descreiption = descreiption;
	}

}
