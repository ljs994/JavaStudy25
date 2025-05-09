package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		
		String loginid = "ljs" ;
		String loginpw = "1234" ;
		
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("로그인 할 아이디를 입력하세요 : ");
		String id = input.nextLine() ;
		System.out.println("입력하신 id는 : " +id + " 입니다. ");
		
		System.out.print("로그인 할 비밀번호를 입력하세요 : ");
		String pw = input.nextLine() ;
		System.out.println(" ==== 검증 중입니다. ====");
		
		if( (loginid.equals(id)) & loginpw.equals(pw) ) {
			
			System.out.println("id나 pw가 일치합니다.");
			System.out.println("로그인 성공");
			
		} else {
			System.out.println("id나 pw가 다릅니다.");
			System.out.println("로그인 실패");
			
		}
		
		
		
		

	}

}
