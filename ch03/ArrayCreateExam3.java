package ch03;

public class ArrayCreateExam3 { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		double[] arr2 = new double[3];
		for(int i = 0 ; i < 3 ; i++ ) { // for문 시작
			System.out.println("arr2[" + i + ']' + arr2[i]);
		} // for문 종료
		
		arr2[0] = 10.0 ;
		arr2[1] = 20.0 ;
		arr2[2] = 30.0 ;
		for(int i = 0 ; i < 3 ; i++) { // for문 시작
			System.out.println("arr2[" + i + "]" + arr2[i]);
		} // for문 종료
		
		String[] arr3 = new String[3] ;
		for(int i = 0 ; i <3 ; i++) { // for문 시작
			System.out.println("arr3[" + i + "]" + arr3[i]);
		} // for문 종료
		
		arr3[0] = "이재상" ;
		arr3[1] = "엠비씨" ;
		arr3[2] = "자바" ;
		for(int i = 0 ; i < 3 ; i++) { // for문 시작
			System.out.println("arr3[" + i + "]" + arr3[i]);
		} // for문 종료
		
	} // main 메서드 종료

} // class 종료
