package ch05.lineage.DTO;

public class Account { // 로그인 클래스
	// 필드
	private String id;
	private String pw;
	private String nickName;
	private String knighDTO;
	private String elfDTO;
	
	
	
	// 생성자
	
	
	
	
	// 메서드
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNickName() {
		return nickName;
	}
	public String getKnighDTO() {
		return knighDTO;
	}
	public String getElfDTO() {
		return elfDTO;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setKnighDTO(String knighDTO) {
		this.knighDTO = knighDTO;
	}
	public void setElfDTO(String elfDTO) {
		this.elfDTO = elfDTO;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", pw=" + pw + ", nickName=" + nickName + ", knighDTO=" + knighDTO + ", elfDTO="
				+ elfDTO + "]";
	}
	

}
