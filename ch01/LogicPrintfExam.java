package ch01;

import java.util.Scanner;

public class LogicPrintfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("이름 : ");
		String name = input.next() ;
		
		System.out.print("나이 : ");
		int age = input.nextInt();
		
		System.out.print("성별 : ");
		String a = input.next() ;
		
		System.out.printf("현재 당신의 이름은 %s\n 당신의 나이는%d\n 성별은 %s\n 입니다.", name , age , a);
		
		

	}

}
