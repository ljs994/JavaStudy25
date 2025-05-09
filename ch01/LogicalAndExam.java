package ch01;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("정수를 입력하면 대소문자나 숫자를 판단합니다. : ");
		
		int charCode = input.nextInt() ;
		
		if( (charCode >= 65) & (charCode <= 90) ) {
			System.out.println("입력값은 대문자 입니다. : " + ( (char)charCode) );
			
		}else if ( (charCode >= 97) && (charCode <= 132) ) {
			System.out.println("입력값은 소문자 입니다. : " + ( (char)charCode) );
			
		}else if ( !(charCode < 48) && !(charCode > 57) ) {
			System.out.println("입력값은 숫자 입니다. : " + ( (char)charCode) );
			
		}else {
			System.out.println("입력값은 대소문자나 숫자가 아닙니다.");
		}

	}

}
