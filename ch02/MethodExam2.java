package ch02;

import java.util.Scanner;

public class MethodExam2 { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		// 성적처리 프로그램을 만들어 보자
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		Scanner inputCha = new Scanner(System.in);
		boolean run = true ;
		boolean run2 = false ;
		String id = "ljs";
		String pw = "1234";
		
		
		while (run) {
			System.out.println("성적 프로그램에 오신 걸 환영합니다. \n당신의 성적을 확인 하기 위해서 로그인을 해주세요.");
			System.out.print("ID : ");
			String inputID = inputStr.next();
			System.out.print("PW : ");
			String inputPW = inputStr.next();
			if (inputID.equals(id) && inputPW.equals(pw)) {
				System.out.println("로그인에 성공하셨습니다.");
				System.out.println("다음 메뉴를 선택해주세요.");
				System.out.println("1. 국어성적 조회 \t2. 수학성적 조회 \t3. 영어성적 조회");
				System.out.println("4. 성적 총합 \t5. 성적 평균 \t6. 로그아웃");
			} else if (inputID.equals(id) & !inputPW.equals(pw)) {
				System.out.println("ID는 맞지만 PW가 다릅니다.");
				System.out.println("PW를 확인해주세요.");
			} else if (!inputID.equals(id) & inputPW.equals(pw)) {
				System.out.println("PW는 맞지만 ID가 다릅니다.");
				System.out.println("ID를 확인해주세요.");
				run = false;
			} 
		}
		
		

	} // main 메서드 종료

} // class 종료
