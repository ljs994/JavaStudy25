package ch04.marioKart.serivice;

import java.util.Scanner;

import ch04.marioKart.dto.MemberDTO;

public class MemberSerivice { //회원가입, 회원정보, 회원수정, 회원삭제 구현하는 곳 
	// 필드
	
	
	// 생성자
	
	
	// 메서드
	
	public void menu(Scanner input, MemberDTO[] memberDTOs) { // 회원가입 메뉴 메서드
		System.out.println("======= 회원가입 메뉴입니다 .=======\n");
		boolean subrun = true;
		while (subrun) {
			System.out.println("1. 회원가입 진행하기 \t 2. 뒤로가기");
			System.out.print(">>> ");
			int select = input.nextInt();
			switch (select) {
			case 1:
				create(input, memberDTOs);
				break;
			case 2:
				System.out.println("메인 메뉴로 돌아갑니다.");
				subrun = false;
			} // switch문 종료
		} // while문 종료
		
		
		
	} // 회원가입 메뉴 메서드 종료

public void create(Scanner input, MemberDTO[] memberDTOs) { // 회원가입 진행 메서드
	MemberDTO memberDTO = new MemberDTO(); 
	
	System.out.println("회원 가입을 진행하겠습니다.");
	System.out.println("===========================");
	
	System.out.println("사용하실 ID를 입력해주세요.");
	System.out.print("ID : ");
	memberDTO.id = input.next();
	
	System.out.println("사용하실 PW를 입력홰주세요.");
	System.out.print("PW : ");
	memberDTO.pw = input.next();
	
	System.out.println("사용하실 이메일을 입력해주세요");
	System.out.print("이메일 : ");
	memberDTO.email = input.next();
	
	System.out.println("사용하실 닉네임을 입력해주세요");
	System.out.print("닉네임 : ");
	memberDTO.nickName = input.next();
	
	for(int i = 0; i < memberDTOs.length; i++) { // 만약 null인 부분이 있으면 그 부분에 넣기 위한 for문
		if(memberDTOs[i] == null) {
			memberDTOs[i] = memberDTO;
			break ; // break는 모든 null값에 들어가는걸 방지하기위해 씀
		} // if문 종료
	} // for문 종료
	
	
	
} // 회원가입 진행 메서드 종료
	
	
	
} // class 종료
