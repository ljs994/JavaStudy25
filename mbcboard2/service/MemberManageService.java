package mbcboard2.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard2.dao.Member2DAO;

public class MemberManageService {
	
	public Member2DAO member2dao = new Member2DAO();

	public void memberManage(Scanner inputStr, Scanner inputInt) throws SQLException {
		// 회원 관리용 메서드
		boolean manRun = true;

		while (manRun) {
			System.out.println("회원 관리용 메뉴입니다.");
			System.out.println("1.회원 전체보기\t 2. 회원 검색\t 3. 회원정보 수정하기\t 4. 회원정보 삭제하기\t 5. 뒤로가기");
			System.out.print("메뉴 선택 : ");
			String select = inputStr.next();

			switch (select) {
			case "1":
				System.out.println("회원 전체보기 메뉴로 이동합니다.");
				member2dao.selectAll();
				break;
			case "2":
				System.out.println("회원 검색 메뉴로 이동합니다.");
				member2dao.selectOne(inputStr);
				break;
			case "3":
				System.out.println("회원정보 수정 메뉴로 이동합니다.");
				member2dao.update(inputStr);
				break;
			case "4":
				System.out.println("회원정보 삭제 메뉴로 이동합니다.");
				member2dao.delete(inputStr);
				break;
			case "5":
				System.out.println("이전 메뉴로 이동합니다.");
				manRun = false;
				break;
			default:
				System.out.println("1~5까지 숫자만 입력 해주세요");
				break;
			}

		} // while문 종료
		// connection, resultSet, preparedStatement, statement가 열려있으면 닫는 메서드
		member2dao.goMain();

	} // memberManage 메서드 종료

} // class 종료
