package ch04.marioKart.serivice;

import java.util.Scanner;

import ch04.marioKart.dto.MemberDTO;

public class LoginSerivice {// 로그인 서비스 class
	
	public void loginmenu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		System.out.println("======= 로그인을 진행합니다. =======");
		System.out.print("ID : ");
		String id = input.next();
		System.out.print("PW : ");
		String pw = input.next();
		MemberDTO logMember = new MemberDTO();
		logMember.id = id;
		logMember.pw = pw;
		
		for(int i = 0 ; i < memberDTOs.length; i ++) {
			if(memberDTOs[i] != null && memberDTOs[i].equals(id)) {
				
			}
			
		}
	}
	

}
