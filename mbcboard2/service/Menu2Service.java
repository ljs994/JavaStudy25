package mbcboard2.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard2.dao.Member2DAO;
import mbcboard2.dto.Member2DTO;

public class Menu2Service {
	// 필드
	public Member2DAO member2dao = new Member2DAO();

	// 메서드
	public Member2DTO memMenu(Scanner inputStr, Scanner inputLine, Scanner inputInt) throws SQLException {
		boolean subRun = true;
		Member2DTO loginUser = null;  // 로그인한 사용자 정보를 저장할 변수

		while (subRun) {
			System.out.println("================================");
			System.out.println("로그인/회원가입/회원관리 메뉴에 들어오셨습니다.");
			System.out.println("1. 로그인\t 2.회원가입\t 3. 회원관리\t 4. 뒤로가기");
			System.out.print("메뉴 선택 : ");
			String subSelect = inputStr.next();

			switch (subSelect) {
				case "1":
					System.out.println("로그인 메뉴로 이동합니다.");
					System.out.print("ID 입력: ");
					String id = inputStr.next();
					System.out.print("PW 입력: ");
					String pw = inputStr.next();

					loginUser = member2dao.login(id, pw);
					if (loginUser != null) {
						System.out.println(loginUser.getMname() + "님 로그인 성공!");
						return loginUser;  // 로그인 성공 시 바로 반환
					} else {
						System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인하세요.");
					}
					break;

				case "2":
					System.out.println("회원가입 메뉴로 이동합니다.");
					CreateMemberService createMemberService = new CreateMemberService();
					createMemberService.createMember(inputStr, inputInt);
					break;

				case "3":
					System.out.println("회원관리 메뉴로 이동합니다.");
					MemberManageService memberManageService = new MemberManageService();
					memberManageService.memberManage(inputStr, inputInt);
					break;

				case "4":
					System.out.println("이전 메뉴로 이동합니다.");
					subRun = false;
					break;

				default:
					System.out.println("1~4까지의 숫자만 입력하세요.");
					break;
			}
		}
		return null;  // 로그인하지 않고 빠져나온 경우
	}
}
