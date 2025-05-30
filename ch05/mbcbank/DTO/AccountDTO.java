package ch05.mbcbank.DTO;

public class AccountDTO { // 은행에 필요한 정보들을 미리 설정하는곳(계좌번호, 계좌주, 잔고, 은행명을 만듬)
	// 필드
	private String ano;
	private String owner;
	private int balance;
	private String bankname;

	// 생성자
	public AccountDTO(String ano, String owner, int balance, String bankname) { // Source -> Generate Constructor using
																				// Fields... 선택
		// super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
	}// 모든 필드를 사용한 생성자

	public AccountDTO() {

	}

	// 메서드

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + ", bankname=" + bankname + "]";
	}

}
