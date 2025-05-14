package ch02;

public class SwitchNoBreakExam { // class시작

	public static void main(String[] args) { // main 메서드 시작
		// break가 없는 switch문
		
		int hour = (int)(Math.random()*23) ;
		int minute = (int)(Math.random()*59) ;
		System.out.println("현재 시간은 " + hour + "시" + minute + "분 입니다.");
		
		switch(hour) { // switch문 시작
		case 9 :
			System.out.println("1교시 입니다.");
		case 10 :
			System.out.println("2교시 입니다.");
		case 11 :
			System.out.println("3교시 입니다.");
		case 12 :
			System.out.println("4교시 입니다.");
		case 13 :
			System.out.println("점심시간 입니다.");
		case 14 :
			System.out.println("5교시 입니다.");
		case 15 :
			System.out.println("6교시 입니다.");
		case 16 :
			System.out.println("7교시 입니다.");
		default :
			System.out.println("학교에 있을 시간이 아닙니다.");
			// 예를 들어 10시30분이면 "2교시 입니다." 이후 "학교에 있을 시간이 아닙니다." 까지 다 나온다
			
		
		
		
		
		} // switch문 종료

		
		
		
		
		
		

	} // main 메서드 종료

} // class종료
