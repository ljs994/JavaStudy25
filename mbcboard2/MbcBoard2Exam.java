package mbcboard2;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard2.dao.Member2DAO;
import mbcboard2.dto.Member2DTO;
import mbcboard2.service.BoardService;
import mbcboard2.service.Menu2Service;

public class MbcBoard2Exam {

	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputLine = new Scanner(System.in);
	
	public static Member2DTO sessionUser = null;

	public static void main(String[] args) throws SQLException {
		// mbcboard 업그레이드 해서 만들어 보자
		boolean run = true;

		while (run) {
			System.out.println("========== MBC 자유 게시판 입니다. ==========");
			if (sessionUser != null) {
				System.out.println("로그인 상태: " + sessionUser.getMname() + "님");
			} else {
				System.out.println("로그인 되어 있지 않습니다.");
			}
			System.out.println("1. 로그인/회원가입/회원관리 \t 2. 게시판 \t 3. 프로그램종료");
			System.out.print("메뉴 선택 : ");
			String select = inputStr.next();

			switch (select) {
			case "1":
				System.out.println("로그인/회원가입/회원관리 메뉴로 진입합니다.");
				Menu2Service menu2Service = new Menu2Service();
				sessionUser = menu2Service.memMenu(inputStr, inputLine, inputInt);
				break;

			case "2":
			    if (sessionUser == null) {
			        System.out.println("※ 게시판 메뉴는 로그인 후 이용 가능합니다. 먼저 로그인 해주세요.");
			    } else {
			        System.out.println("게시판 메뉴로 이동합니다.");
			        BoardService boardService = new BoardService();
			        boardService.boardMenu(inputStr, inputLine, inputInt, sessionUser);
			    }
			    break;


			case "3":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("1~3까지의 숫자만 입력하세요.");
				break;
			} // switch문 종료
		} // while문 종료
		

	}

}
