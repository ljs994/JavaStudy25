package ch01;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("숫자를 입력하시오 ");
		int num = input.nextInt() ;
		System.out.println(num % 2 == 0 ?  "짝수 "  :  "홀수");

	}

}
