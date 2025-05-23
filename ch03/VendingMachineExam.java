package ch03;

import java.util.Scanner;

public class VendingMachineExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		// 자판기 프로그램을 구현해보자(2025-05-19미완성)
		// 맨 처음 자판기를 사용 하기 전 넣고 싶은 음료랑 수량 가격을 설정한다.
		// 자판기를 돌리기 위해 처음 관리자 메서드로 이동 후 메뉴, 수량, 가격을 설정
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		boolean run = true;
		boolean session = false;
		boolean run2 = false;
		String[] menus = new String[2];
		int[] count = new int[2];
		int[] price = new int[2];
		// 관리자 메서드에 필요한 값을 미리 만들어 놓음

		String id = "1234";
		String pw = "1234";
		String admin = "관리자";
		// 관리자 로그인을 위해 필요한 변수 선언

		while (run) { // 자판기가 아직 판매를 하지 않으므로 관리자 로그인으로 자판기를 실행 시킵니다.
			System.out.println("======mbc 자판기 입니다.======");
			System.out.println("손님은 자판기가 채워질때 까지 기다려 주세요");
			System.out.println("관리자면 관리자특수 단어를 입력해주세요.");
			System.out.print("= ");
			String AD = inputStr.next();
			switch (AD) { // switch문 시작
			case "관리자":
				System.out.println("관리자 확인을 위해 로그인을 해주세요.");

				// boolean isLoginOK = LoginOK(id, pw, menus, count, price, run, session);
				session = LoginOK(id, pw, menus, count, price, run, session);
				if (session = true) { // 초기 음료 설정이 끝난 후 자판기 가동 시작!!!
					System.out.println("오래 기다리셨습니다.");
					System.out.println("메뉴를 보여드리겠습니다.");
					run2 = buyer(menus, count, price, run, session);

				}
				break;
			default:
				System.out.println("해킹이 의심되어 강제종료합니다.");
				run = false;

			} // switch문 종료
		}

	} // main 메서드 종료
// 사용자 메서드=============================================================================================
	static boolean buyer(String[] menus, int[] count, int[] price, boolean run, boolean session) {
		
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("1. " + menus[0] + " 2. " + menus[1]);
		System.out.println("마시고 싶은 음료를 선택해 주세요.");
		System.out.println("1. " + menus[0] + " 2. " + menus[1] + " 3. 안사요.");
		System.out.print(">>> ");
		int select = inputInt.nextInt();
		switch (select) {
		case 1 :
			boolean buyer = soda1(menus, count, price, run);
		}
		
		
		
		return false;
	}// 사용자 메서드 종료

	static boolean soda1(String[] menus, int[] count, int[] price, boolean run) {// 1번 음료 메서드
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		
			System.out.println(menus[0] + "의 남은 수량과 가격을 알려드리겠습니다.");
			System.out.println(count[0] + "개 " + price[0] + "원 입니다.");
			System.out.println("구매를 원하시면 'yes' 뒤로 돌아가고 싶으면 'no' 를 입력해주세요.");
			System.out.print(">>> ");
			String ch = inputStr.next();
			if (ch.equalsIgnoreCase("yes")) {
				System.out.println("몇개 를 구매하시겠습니까?");
			}else if(ch.equalsIgnoreCase("no")) {
				System.out.println("다시 메뉴를 선택해주세요.");
				
			}
		
	return false;
}// 1번 음료 메서드 종료
	static boolean LoginOK(String id, String pw, String[] menus, int[] count, int[] price, boolean run2,
			boolean session) { // 관리자용 메서드

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		System.out.print("ID : ");
		String ID = inputStr.next();
		System.out.print("PW : ");
		String PW = inputStr.next();

		if (id.equals(ID) && pw.equals(PW)) {
			System.out.println("로그인에 성공 하셨습니다.");
			System.out.println("관리자 메뉴를 보여드리겠습니다.");
			System.out.println("1. 음료설정\t 2. 음료변경\t 3. 가격변경");
			System.out.println("4. 음료리필\t 9. 처음으로");
			System.out.print("선택 : ");
			int select = inputInt.nextInt();
			switch (select) { // switch 문 시작
			case 1: // 초기 음료 설정

				for (int i = 0; i < menus.length; i++) { // 음료수 이름, 수량, 가격을 넣기 위한 for문 시작
					System.out.println("음료 이름을 말하세요");
					System.out.print(">>> ");
					String names = inputStr.next();
					menus[i] = names;
					System.out.println(names + " 음료로 설정하겠습니다.");

					// 음료의 이름 설정
					System.out.println("채우고 갯수를 입력해주세요.");
					System.out.print(">>> ");
					int co = inputInt.nextInt();
					count[i] = co;
					System.out.println(co + "개의 음료수를 넣겠습니다.");
					// 음료의 수량 설정

					System.out.println("음료수의 가격을 넣어주세요.");
					System.out.print(">>> ");
					int pi = inputInt.nextInt();
					price[i] = pi;
					// 음료의 가격 설정

				} // 음료수 이름, 수량, 가격을 넣기 위한 for문 종료
				System.out.println("음료수 설정이 완료 되었습니다.");
				session = true; // case1 종료
				break;
			case 2: // 음료 변경
				chMenus(menus, session);
			case 3:
				chPrice(menus, price, session);
			} // switch문 종료

		} else if (ID.equals(id) & !PW.equals(pw)) { // ID는 맞지만 비밀번호가 다를경우
			System.out.println("비밀번호가 일치하지 않습니다.");
		} else if (!ID.equals(id) & PW.equals(pw)) {
			System.out.println("아이디가 일치하지 않습니다.");
		}

		return session;
	} // 관리자 메서드 종료

	static boolean chPrice(String[] menus, int[] price, boolean session) {
		Scanner input = new Scanner(System.in);

		System.out.print("가격 변경할 음료를 말해주세요 :");
		String menu = input.next();
		for (int i = 0; i < menus.length; i++) {
			if (menus[i].equals(menu)) {
				System.out.println(menus[i] + " 음료의 가격은 " + price[i] + " 원 입니다.");
				System.out.println("얼마로 변경하시겠나요?");
				System.out.print("변경 금액 : ");
				price[i] = input.nextInt();
				System.out.println(menus[i] + " 음료의 가격을 " + price[i] + " 원으로 바꿉니다.");
				session = true;
			}
		} // 가격 변경 for문끝
		return session;

	} // 가격 변경 메서드 종료

	static boolean chMenus(String[] menus, boolean session) { // 음료변경 메뉴
		Scanner input = new Scanner(System.in);

		System.out.print("변경하실 음료를 말씀해주세요 : ");
		String menu = input.next();
		for (int i = 0; i < menus.length; i++) {
			if (menus[i].equals(menu)) {
				System.out.println("기존 메뉴는 " + menus[i] + "입니다.");
				System.out.println("어떤 메뉴로 변경하시겠습니까?");
				System.out.print(">>>> ");
				menus[i] = input.next();
				System.out.println(menus[i] + "로 변경 되었습니다.");
				session = true;
			}
		} // 음료변경 for문 끝
		return session;

	}// 음료 변경 메서드 종료

} // class 종료
