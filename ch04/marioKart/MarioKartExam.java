package ch04.marioKart;

import java.util.Scanner;

import ch04.marioKart.dto.CartDTO;
import ch04.marioKart.dto.CharacterDTO;
import ch04.marioKart.dto.ItemDTO;
import ch04.marioKart.dto.MemberDTO;
import ch04.marioKart.dto.PartDTO;
import ch04.marioKart.dto.TireDTO;
import ch04.marioKart.serivice.LoginSerivice;
import ch04.marioKart.serivice.MemberSerivice;

public class MarioKartExam {
	// 필드 생성
	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[1]; // 1명 회원
	public static CharacterDTO[] characterDTOs = new CharacterDTO[5]; // 5개의 캐릭터
	public static CartDTO[] cartDTOs = new CartDTO[5]; // 5개의 카트
	public static PartDTO[] partDTOs = new PartDTO[5]; // 5개의 파츠(튜닝용)
	public static TireDTO[] tireDTOs = new TireDTO[3]; // 3개의 타이어(튜닝용)
	public static ItemDTO[] itemDTOs = new ItemDTO[4]; // 4개의 아이템
	
	public static MemberDTO loginState;

	// 캐릭터(이름, 무게, 속도, 가속, 핸들링, 마찰력)
	static {
		CharacterDTO caCharacterDTO0 = new CharacterDTO("마리오", 5.0, 5.0, 5.0, 5.0, 5.0);
		CharacterDTO caCharacterDTO1 = new CharacterDTO("루이지", 5.5, 4.5, 5.0, 5.2, 4.8);
		CharacterDTO caCharacterDTO2 = new CharacterDTO("와르르", 4.7, 5.3, 4.9, 5.1, 5.0);
		CharacterDTO caCharacterDTO3 = new CharacterDTO("펑키콩", 4.8, 5.1, 5.0, 5.2, 4.9);
		CharacterDTO caCharacterDTO4 = new CharacterDTO("캐서린", 4.6, 5.4, 5.1, 4.8, 5.1);

		characterDTOs[0] = caCharacterDTO0;
		characterDTOs[1] = caCharacterDTO1;
		characterDTOs[2] = caCharacterDTO2;
		characterDTOs[3] = caCharacterDTO3;
		characterDTOs[4] = caCharacterDTO4;

	}

	public static void main(String[] args) { // main 메서드 -> 메인에서는 최대한 불러오고, 최대한 ui는 서비스class에서 만들 예정입니다.
		System.out.println("======== 마리오 카트 게임을 시작합니다 ========\n");

		boolean run = true; // while문 (처음 메뉴를 반복하기위함) 돌리기 위한 선언
		while (run) {
			System.out.println("******** 메뉴를 선택 해주세요. ********\n");
			System.out.println("1. 회원가입 \t 2. 로그인 \t 3. 게임실행 \t 4. 종료\n");
			System.out.print("메뉴 선택 : ");
			int select = input.nextInt();
			switch (select) {// 메뉴 선택 switch문 시작
			case 1:
				MemberSerivice memberSerivice= new MemberSerivice();
				memberSerivice.menu(input, memberDTOs);
				break;
			case 2:
				LoginSerivice loginSerivice = new LoginSerivice();
				loginSerivice.loginmenu(input, memberDTOs, loginState);
				break;
			case 3:
				break;
			case 4:
				System.out.println("======== 마리오 카트 게임을 종료합니다 ========");
				run = false;
				break;
			default:
				System.out.println("1~4까지의 메뉴를 선택해주세요.");
			} // switch문 종료

		} // while문 종료

	}

} // class 종료
