package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.service.HanaBnakService;

public class BankExam {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] woriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];
	public static AccountDTO session = null;

	// 생성자
	static {
		// 하나은행
		AccountDTO accountDTO0 = new AccountDTO("1234", "이재상", 0, "하나");
		hanaBank[0] = accountDTO0;

		// 우리은행
		AccountDTO accountDTO1 = new AccountDTO("5678", "이재상", 0, "우리");
		woriBank[0] = accountDTO1;

		// 농협은행
		AccountDTO accountDTO2 = new AccountDTO("9876", "이재상", 0, "농협");
		nhBank[0] = accountDTO2;

	}

	public static void main(String[] args) {
		// mbcbank main 메서드
		// 테스트 코드
//		System.out.println("하나은행 계좌정보 : " + hanaBank[0]);
//		System.out.println("우리은행 계좌정보 : " + woriBank[0]);
//		System.out.println("농협은행 계좌정보 : " + nhBank[0]);

		boolean run = true;

		while (run) {
			System.out.println("======= mbc 금융위원회 프로그램입니다. =======");
			System.out.println("이용하실 은행을 선택 해주세요.");
			System.out.println("1. 하나은행 \t 2. 우리은행 \t 3. 농협은행 \t 4. 프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("하나은행으로 이동 하겠습니다.");
				HanaBnakService hanaBnakService = new HanaBnakService();
				hanaBnakService.menu(inputStr, inputInt, hanaBank, woriBank, nhBank);
				break;
			case "2":
				System.out.println("우리은행으로 이동 하겠습니다.");
				break;
			case "3":
				System.out.println("농협은행으로 이동 하겠습니다.");
				break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1~4번까지의 번호만 입력해 주세요.");
				break;

			}// switch문 종료
		}// while문 종료

	} // 메인 메뉴 메서드 종료

}// class 종료
