package ch02;

import java.util.Scanner;

public class SwitchIfExam { // class시작

	public static void main(String[] args) { // main 메서드시작
		// switch문과 if문을 사용해본다.
		
		int kor = (int)(Math.random()*101) ;
		int mat = (int)(Math.random()*101) ;
		int eng = (int)(Math.random()*101) ;
		int total = kor + mat + eng ;
		
		Scanner in = new Scanner(System.in) ;
		Scanner str = new Scanner(System.in) ;
		System.out.println("안녕하세요 XX 학원에 오신걸 환영합니다.");
		System.out.println("다음 메뉴를 선택 해주세요.");
		System.out.println("1 : 강사 소개");
		System.out.println("2 : 강의 안내");
		System.out.println("3 : 성적 조회");
		System.out.println("4 : 오시는 길"); // 메뉴설정
		System.out.print("메뉴 선택 : ");
		
		int select = in.nextInt() ;
		
		switch(select) { //스위치문 시작
		case 1 :
			System.out.println("강사 소개 메뉴입니다.");
			System.out.println("a : 짱구 강사");
			System.out.println("b : 철수 강사");
			System.out.println("c : 유리 강사");
			System.out.println("d : 맹구 강사");
			System.out.println("선택하고 싶은 강사를 선택하세요.");
			System.out.print("강사 선택 : ");
			String subSelect = str.next();
			if (subSelect.equalsIgnoreCase("a")) {
				System.out.println("짱구 강사를 소개해 드리겠습니다.");
			}else if (subSelect.equalsIgnoreCase("b")) {
				System.out.println("철수 강사를 소개해 드리겠습니다.");
			}else if (subSelect.equalsIgnoreCase("c")) {
				System.out.println("유리 강사를 소개해 드리겠습니다.");
			}else if (subSelect.equalsIgnoreCase("d")) {
				System.out.println("맹구 강사를 소개해 드리겠습니다.");
			}else {
				System.out.println("잘못입력 하셨습니다 다시 시도해주세요.");
			} // 강사소개 메뉴 종료
		case 2 :
			System.out.println("강의 안내 메뉴입니다.");
			System.out.println("1 : 강의목록");
			System.out.println("2 : 강의일정");
			System.out.println("3 : 강의시간");
			System.out.println("4 : 강의목적");
			System.out.println("선택 하고 싶은 항목을 선택 하세요.");
			System.out.print("선택 : ");
			int choice = in.nextInt() ;
			if (choice == 1) {
				System.out.println("강의목록을 선택하셨습니다.");
			}else if (choice == 2) {
				System.out.println("강의일정을 선택하셨습니다.");
			}else if (choice == 3) {
				System.out.println("강의시간을 선택하셨습니다.");
			}else if (choice == 4) {
				System.out.println("강의목적을 선택하셨습니다.");
			}else {
				System.out.println("해당 숫자는 선택 항목에 없습니다.");
			} // 강의안내 메뉴 종료
		case 3 :
			System.out.println("성적조회 메뉴를 선택하셨습니다.");
			System.out.println("a : 국어성적");
			System.out.println("b : 수학성적");
			System.out.println("c : 영어성적");
			System.out.println("d : 총점");
			System.out.println("확인 하고 싶은 성적의 메뉴를 고르세요");
			System.out.print("선택 : ");
			String score = str.next() ;
			if (score.equalsIgnoreCase("a")) {
				System.out.println("국어 성적은 " + kor + "점 입니다.");
			}else if (score.equalsIgnoreCase("b")) {
				System.out.println("수학 성적은 " + mat + "점 입니다.");
			}else if (score.equalsIgnoreCase("c")) {
				System.out.println("영어 성적은 " + eng + "점 입니다.");
			}else if (score.equalsIgnoreCase("d")) {
				System.out.println("국어, 수학, 영어 총점은 " + total + "점 입니다");
			}else {
				System.out.println("당신의 총점을 확인할 수 없습니다.");
				System.out.println("초기 메뉴 화면으로 돌아가세요.");
			} // 성적조회 메뉴 종료
		case 4 :
			System.out.println("오시는 길 메뉴를 선택하셨습니다.");
			System.out.println("mbc 아카데미 수원역점을 검색하고 오십시오.");
		default :
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
			System.out.println("프로그램을 종료합니다.");
			
			
			
		} // 스위치문 종료
		
		
		
		

	} // main 메서드종료

} // class종료
