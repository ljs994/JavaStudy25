package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.DTO.Account;
import ch05.lineage.DTO.ElfDTO;
import ch05.lineage.DTO.KnightDTO;

public class LineageExam {
	// 키보드 입력 초기설정
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	// 로그인 관련
	public static Account[] accounts = new Account[5];
	public static Account LoginAccount;
	// 직업관련
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();

	static { // 초기값 설정
		// 전사 설정
		knightDTO.setSword("몽둥이");
		knightDTO.setArmor("나시");
		knightDTO.setShield("나무판자");
		knightDTO.setName("쪼랩기사");
		knightDTO.setSex("남");
		knightDTO.setLevel(1);
		knightDTO.setHp(1000);
		knightDTO.setMp(200);
		knightDTO.setMoney(0);

		// 궁수 설정
		elfDTO.setBow("나무활");
		elfDTO.setDress("잠옷");
		elfDTO.setArrow("나무화살");
		elfDTO.setName("쪼랩궁수");
		elfDTO.setSex("여");
		elfDTO.setLevel(1);
		elfDTO.setHp(700);
		elfDTO.setMp(500);
		elfDTO.setMoney(0);

		Account account = new Account();

		account.setId("ljs");
		account.setPw("ljs");
		account.setNickName("신");

		accounts[0] = account;

	}

	public static void main(String[] args) {
		// System.out.println("테스트 : " + accounts[0]); //테스트용
		
		boolean run = true;
		
		
		System.out.println("====== 리니지를 시작합니다. ======");
		
		while(run) {
			System.out.println("1.로그인 | 2. 캐릭터선택 | 3. 게임실행 | 4.종료");
			System.out.print("선택 : ");
			String select = inputStr.next();
			
		}// while문 종료

	}// 메인 메서드 종료

}// class 종료
