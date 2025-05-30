package schoolrecord.DTO;

public class PersonDTO { // 학생용 DTO
	// 필드
	private String name; // 학생의 이름
	private int kor; // 학생의 국어점수
	private int mat; // 학생의 수학점수
	private int eng; // 학생의 영어점수
	
	
	
	// 생성자
	
	// 기본 생성자
	public PersonDTO() {
		super();
	}
	
	
	// 메서드
	public String getName() {
		return name + "님";
	}
	public int getKor() {
		return kor;
	}
	public int getMat() {
		return mat;
	}
	public int getEng() {
		return eng;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
}
