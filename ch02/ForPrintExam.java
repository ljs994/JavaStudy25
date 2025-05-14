package ch02;

import java.util.Scanner;

public class ForPrintExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작 
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = 0 ;
		System.out.println("확인하고 싶은 min 값을 입력하세요");
		System.out.print("= ");
		int min = input.nextInt() ;
		
		System.out.println("확인하고 싶은 max 값을 입력하세요");
		System.out.print("= ");
		int max = input.nextInt() ;
		
		System.out.println("증가하고 싶은 up 값을 입력하세요.");
		System.out.println("= ");
		int up = input.nextInt() ;
		
		System.out.println(min + " ~ " + max +" 까지" + up + " 씩 증가값은");
		
		for(i = min ; i <= max ; i+=up) { // for문 시작
			System.out.println("증가값은 : " + i);
		} // for문 종료
	} // main 메서드 종료

} // class 종료
