package ch02;

public class For2to9Exam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		// 9x9단 만들기
		
		for ( int m = 2 ; m <= 9 ; m++) {
			System.out.println("===== " + m + "단 ====");
			for ( int n = 1 ; n <= 9 ; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		

	} // main 메서드 종료

} // class 종료
