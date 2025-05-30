package schoolrecord.DTO;

public class AdminDTO { // 로그인 DTO
	private String id ;
	private String pw ;
	
	
	// 생성자
	public AdminDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}


	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
	
}
