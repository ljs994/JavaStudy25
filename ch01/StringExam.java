package ch01;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("이름을 입력하시오. : ");
		String name = input.nextLine() ;
		System.out.print("나이를 입력하시오 : ");
		String age = input.nextLine() ;
		System.out.print("핸드폰 번호를 입력하시오 : ");
		String pnum = input.nextLine() ;
		
		System.out.println(name + "님 소중한 정보 감사합니다. 저희가 잘 쓸게요^^");
		System.out.println("당신의 나이는 " + age + "살 이네요");
		System.out.println(pnum + " 이 번호는 저희가 좋은곳에 사용하겠습니다^^");
		

	}

}
