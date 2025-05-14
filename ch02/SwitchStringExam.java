package ch02;

public class SwitchStringExam { // class시작

	public static void main(String[] args) { // main 메서드 시작
		
		String position = "대리" ;
		
		switch (position) { // switch문 시작
		case "부장" :
			System.out.println(position + " 성과급은 100원");
			break ;
		case "과장" :
			System.out.println(position + " 성과급은 200원");
			break ;
		case "대리" :
			System.out.println(position + " 성과급은 100만원");
			break ;
		default :
			System.out.println("해당사항 없음.");
			break ;
			
			
		} // switch문 종료
		
		
		

	} // main 메서드 종료

} // class종료
