package ch02;

import java.util.Scanner;

public class SsnExam { // class시작

	public static void main(String[] args) { // main 메서드 시작
		
		System.out.print("당신의 주민번호를 입력하세요 : ");
		Scanner in = new Scanner(System.in) ;
		String ssn = in.nextLine() ;
		char gender = ssn.charAt(6) ;
				// System.out.println(gender);
		switch(gender ) { // 스위치문 시작
		case '1' : case '3' : case '5' : case '7' :
			System.out.println("남자입니다.");
			break ;
		case '2' : case '4' : case '6' : case '8' :
			System.out.println("남자입니다.");
			break ;
		default :
			System.out.println("당신은 사람이 아닙니다.");
		
		
		} // 스위치문 종료
		
		

	} // main 메서드 종료

} // class종료
