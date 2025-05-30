package schoolrecord.service;

import java.util.Scanner;

import schoolrecord.DTO.AdminDTO;

public class LoginService {

	
	
	public static void loginOk(Scanner inputStr, AdminDTO adminDTO) {
		
		boolean run = true;

		while (run) {
			System.out.print("ID : ");
			String id = inputStr.next();
			System.out.print("PW : ");
			String pw = inputStr.next();
			if (adminDTO.getId().equals(id) && adminDTO.getPw().equals(pw)) {
				System.out.println("로그인 성공");
				System.out.println("메뉴를 보여드리겠습니다.");
				run = false;
			} else {
				System.out.println("로그인 실패 다시 로그인해주세요.");
			}
			
			
		}

	}// 메서드 종료

}
