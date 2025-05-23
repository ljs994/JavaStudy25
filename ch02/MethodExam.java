package ch02;

import java.util.Scanner;

public class MethodExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		Scanner inputCha = new Scanner(System.in);
		boolean run = true;
		boolean run2 = false;
		String id = "ljs";
		String pw = "dlwotkd";
		// 필요한 명령어들 설정

		while (run) { // while문 시작
			System.out.println("환영합니다. 엠비씨 아카데미에 오신 당신을 환영합니다.");
			System.out.println("선택하고 싶은 메뉴를 고르시오");
			System.out.println("1. 로그인 \t2. 교사관리 \n3. 학생관리 \t4. 성적관리");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = inputInt.nextInt();
			switch (choice) { // switch문 시작
			case 1:
				System.out.println("로그인 화면에 들어오셨습니다.");
				System.out.println("당신의 ID와 PW를 입력해주세요.");
				run2 = LoginOK(id, pw, run2);
				if (run2 == true) {
					System.out.println("로그인에 성공하셨습니다.");
					System.out.println("2~4메뉴를 선택 하실 수 있습니다.");
				} else {
					System.out.println("로그인에 실패하였습니다.");
					System.out.println("ID와 PW를 확인하고 다시 로그인을 해주세요.");
					System.out.println("프로그램을 종료합니다.");
					run = false;
				} // case1의 if문 종료
				break;
			case 2:
				System.out.println("교사관리 메뉴에 들어오셨습니다.");
				break;
			case 3:
				System.out.println("학생관리 메뉴에 들어오셨습니다.");
				break;
			case 4:
				System.out.println("성적관리 메뉴에 들어오셨습니다.");
				break;
			default:
				System.out.println("저희 학원 학생이 아닌거 같아 프로그램을 강제 종료합니다.");
				run = false;
				break;

			} // switch문 종료
		} // while문 종료

	} // main 메서드 종료

	static boolean LoginOK(String id, String pw, boolean run2) { // Login 메서드 시작
		Scanner inputLogin = new Scanner(System.in);
		
		System.out.println("ID를 입력해 주세요.");
		System.out.print("ID : ");
		String inputID = inputLogin.next();
		
		System.out.println("PW를 입력해 주세요.");
		System.out.print("PW : ");
		String inputPW = inputLogin.next();
		
		if(id.equals(inputID) && pw.equals(inputPW)) {
			run2 = true ;
		}else {
			run2 = false ;
		} // if문 종료
		
		return run2;
	} // Login 메서드 종료

} // class 종료
