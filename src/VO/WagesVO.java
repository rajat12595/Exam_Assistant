package VO;

public class WagesVO {

	private int wagesId;
	private String wagesAmount;
	
	private PostVO postVO;
	
	public int getWagesId() {
		return wagesId;
	}
	public void setWagesId(int wagesId) {
		this.wagesId = wagesId;
	}
	
	public String getWagesAmount() {
		return wagesAmount;
	}
	public void setWagesAmount(String wagesAmount) {
		this.wagesAmount = wagesAmount;
	}
	
	public PostVO getPostVO() {
		return postVO;
	}
	public void setPostVO(PostVO postVO) {
		this.postVO = postVO;
	}
	

}
