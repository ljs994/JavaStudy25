package ch02;

import java.util.Scanner;

public class DoWhileExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		System.out.println("메세지를 입력하시오.");
		System.out.println("프로그램을 종료하려면 e를 입력하세요 :");
		Scanner in = new Scanner(System.in) ;
		String inputString ;
		
		do { // do 문 시작
			System.out.print("= ");
			inputString = in.nextLine() ;
			System.out.println("전송값 : " + inputString);
		} // do 문 종료
		while(!inputString.equalsIgnoreCase("q")) ;
		System.out.println("----------");
		System.out.println("프로그램 종료");
		System.out.println("----------");
		

	} // main 메서드 종료

} // class 종료
