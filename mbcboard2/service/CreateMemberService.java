package mbcboard2.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard2.dao.Member2DAO;
import mbcboard2.dto.Member2DTO;

public class CreateMemberService { // 회원가입 class(C)
	
	public Member2DAO member2dao = new Member2DAO();

	public void createMember(Scanner inputStr, Scanner inputInt) throws SQLException {
		Member2DTO member2dto = new Member2DTO();
		
		System.out.println("============================================");
		System.out.println("회원가입을 진행 하겠습니다.");
		System.out.print("성함 : ");
		member2dto.setMname(inputStr.next());
		
		System.out.print("ID : ");
		member2dto.setId(inputStr.next());
		
		System.out.print("PW : ");
		member2dto.setPw(inputStr.next());
		
		System.out.print("email : ");
		member2dto.setEmail(inputStr.next());
		
		member2dao.createMember(member2dto);
		System.out.println("회원가입이 끝났습니다.");
		
		
	}

}
