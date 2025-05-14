package ch02;

public class WhileBooleanExam { // class 시작

	public static void main(String[] args) throws Exception { // main 메서드 시작
		boolean run = true ;
		int speed = 100 ;
		int keyCode = 0 ;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("================================");
				System.out.println("1.엑셀 | 2. 브레이크 | 3. 중지 ");
				System.out.println("================================");
				System.out.print("선택 : ");
			} //if문 종료
			keyCode = System.in.read() ;
			
			if(keyCode == 49) {
				speed += 5 ;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode == 50) {
				speed -= 5 ;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode ==51) {
				run = false ;
				System.out.println("크루즈 기능이 종료됩니다.");
				System.out.println("현재 속도 : " + speed);
				System.out.println("안전운전 하세요.");
			}
		} // while문 종료
		System.out.println("프로그램 종료");
		
		
		
		
		
		

	} // main 메서드 종료

} // class 종료
