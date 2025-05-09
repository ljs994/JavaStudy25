package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("정수를 입력하면 2의 배수인지 3의배수인지 알려드립니다.");
		System.out.println("=======================");
		System.out.print("값을 입력하세요 : ");
		
		int x = input.nextInt() ;
		
		
		if ( ( x%2==0 ) | ( x%3==0 ) ) {
			System.out.println( x + " = 2의 배수 또는 3의 배수가 맞습니다." );
		}else { 
			System.out.println( x + " = 2의 배수 또는 3의 배수가 아닙니다." );
		
	}

}
}
