package ch02;

public class SwitchExam {

	public static void main(String[] args) {
		// 스위치를 사용한 주사위
		
		int num = (int)(Math.random()*6) + 1 ; // 1~6까지 랜덤 숫자 설정
		
		switch(num) { // switch문 시작
		case 1 :
			System.out.println("1번이 나왔습니다");
			break ;
		case 2 :
			System.out.println("2번이 나왔습니다");
			break ;
		case 3 :
			System.out.println("3번이 나왔습니다");
			break ;
		case 4 :
			System.out.println("4번이 나왔습니다");
			break ;
		case 5 :
			System.out.println("5번이 나왔습니다");
			break ;
		case 6 :
			System.out.println("6번이 나왔습니다");
			break ;
		default :
			System.out.println("프로그램 오류로 인하여 강제종료 합니다.");
			break ;
		
		
		
		} // switch문 종료
		
	
		

	} // main 메서드 종료

} // class 종료
