package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;

public class HanaBnakService { // 하나은행 서비스 class
	// 필드

	// 생성자

	// 메서드

	public void menu(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank, AccountDTO[] woriBank,
			AccountDTO[] nhBank) {
		// System.out.println("테스트");
		boolean subRun = true;
		System.out.println("=====================================");
		System.out.println("======= 하나은행에 오신걸 환영합니다. =======");
		while (subRun) {
			System.out.println("=====================================");
			System.out.println("1. 계좌생성 \t 2. 계좌목록 \t 3. 입금");
			System.out.println("4. 출금 \t 5. 계좌이체 \t 6. 뒤로가기");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("계좌생성 메뉴로 이동하겠습니다.");
				createAccount(inputStr, inputInt, hanaBank);
				break;
			case "2":
				System.out.println("계좌목록 메뉴로 이동하겠습니다.");
				accountList(hanaBank);
				break;
			case "3":
				System.out.println("입금 메뉴로 이동하겠습니다.");
				deposit(inputStr, inputInt, hanaBank);
				break;
			case "4":
				System.out.println("출금 메뉴로 이동하겠습니다.");
				break;
			case "5":
				System.out.println("계좌이체 메뉴로 이동하겠습니다.");
				break;
			case "6":
				System.out.println("뒤로가기 메뉴로 이동하겠습니다.");
				subRun = false;
				break;
			default:
				System.out.println("1~6까지의 숫자만 입력해주세요.\n");
			}// 하나은행 menu(switch)종료

		} // while문 종료
	}// 하나은행 menu(메서드)종료

	private void deposit(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		// 입금용 메서드
		System.out.println("=======================");
		System.out.println("입금을 진행 하겠습니다.");
		
		System.out.print("계좌번호 : ");
		String ano = inputStr.next();
		
		System.out.print("입금할 금액 : ");
		int money = inputInt.nextInt();
		
		AccountDTO inputaccAccountDTO = findAccountDTO(ano,hanaBank);
		
	}

	private AccountDTO findAccountDTO(String ano, AccountDTO[] hanaBank) {
		// 입금, 출금, 이체에서 계좌번호를 이용해 객체를 찾는 반복 코드 메서드
		return null;
	}

	private void accountList(AccountDTO[] hanaBank) {
		// 하나은행 전체 계좌 목록
		System.out.println("======================");
		System.out.println("하나은행 전체 계좌 목록입니다.");
		for (int i = 0; i < hanaBank.length; i++) {
			AccountDTO hanaList = hanaBank[i];
			if (hanaBank[i] != null) {
				System.out.println(hanaList.getAno() + "\t" + hanaList.getOwner() + "\t" + hanaList.getBankname());
			} // 하나은행 객체 안에 null값이 아니면 나오는 if문 종료
		} // for문 종료

	} // 하나은행 계좌 목록 메서드 종료

	private void createAccount(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		// 계좌생성 메서드
		System.out.println("======================");
		System.out.println("하나은행 계좌를 생성하겠습니다.");
		AccountDTO myAccountDTO = new AccountDTO(); // 새로운 객체 생성

		System.out.print("계좌번호 : ");// 계좌번호를 setAno에 직접입력
		myAccountDTO.setAno(inputStr.next());

		System.out.print("계좌주 : ");
		myAccountDTO.setOwner(inputStr.next());

		System.out.print("초기 입금할 금액 : ");
		myAccountDTO.setBalance(inputInt.nextInt());

		myAccountDTO.setBankname("하나");

		// 하나은행 배열에 객체를 삽입 (null인지 확인하고 넣음)

		for (int i = 0; i < hanaBank.length; i++) {
			if (hanaBank[i] == null) {
				// i값이 null이면 그 안에 객체를 넣는다.
				hanaBank[i] = myAccountDTO;
				// System.out.println("테스트" + hanaBank[i]);
				break;
			}

		} // for문 종료
		System.out.println("계좌가 성공적으로 등록되었습니다.");

	}// 계좌생성 메서드 종료

}// 하나은행 서비스 class 종료
