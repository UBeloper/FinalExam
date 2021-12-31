
public class Board {
	//필드
	private int bNum;
	private String bSubject;
	private String bName;
	
	
	
	// 생성자
	public Board() {
		
	}
	
	// 오버로딩된 생성자 - 안만들고 해보기
//	public Board(int bNum, String bSubject, String bName) {
//		this.bNum = bNum;
//		this.bSubject = bSubject;
//		this.bName = bName;
//	}
	
	
	public int getbNum() {
		return bNum;
	}
	
	public String getbSubject() {
		return bSubject;
	}
	
	public String getbName() {
		return bName;
	}
	
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	
	public void setbSubject(String bSubject) {
		this.bSubject = bSubject;
	}
	
	public void setbName(String bName) {
		this.bName = bName;
	}
	



}
