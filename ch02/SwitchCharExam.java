package ch02;

import java.util.Scanner;

public class SwitchCharExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		// charAt을 사용
		
		Scanner inChar = new Scanner(System.in) ;
		
		System.out.print("회원 등급을 입력하세요 (A~C) : ");
		
		char gradeChaStr = inChar.next().charAt(0) ;
		
		System.out.println("검증 코드용(1줄) : " + gradeChaStr);
		
		switch(gradeChaStr) { // switch문 시작
		
		case 'a' :
		case 'A' :
			System.out.println("VIP 회원입니다.");
			break ;
			
		case 'b' :
		case 'B' :
			System.out.println("GOLD 회원입니다.");
			break ;
		case 'c' :
		case 'C' :
			System.out.println("일반 회원입니다.");
			break ;
		default :
			System.out.println("저희 회원이 아니십니까?");
			System.out.println("회원 가입을 하시려면 yes를 입력해 주세요.");
			String newMember = inChar.next() ;
			if(newMember.equalsIgnoreCase("yes")) { // 회원가입 if문 시작
				System.out.println("회원가입을 진행합니다.");
				System.out.print("ID : ");
				String id = inChar.next() ;
				System.out.println(id + "님 회원가입을 축하합니다.");
				break ;
			}else {
				System.out.println("저희 회원이 될 자격이 없습니다.");
				System.out.println("프로그램을 강제 종료합니다.");
				break ;
								
			} // 회원가입 if문 종료
			
		
		
		} // switch문 종료
		

	} // main 메서드 시작

} // class 시작
