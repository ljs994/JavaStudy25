package ch01;

public class ByteExam {

	public static void main(String[] args) {
		
		// byte var1 = -128 ;
		// byte var2 = -30 ;
		// byte var3 = 0 ;
		// byte var4 = 30 ;
		// byte var5 = 127 ;
		// byte var6 = 128 ; // 범위를 초과하여 오류가 발생한다.
		
		byte var1 = 125 ;
		int var2 = 125 ;
		for(int i = 0 ; i < 5 ; i++) {   //변수 i를 0~5까지 1씩 증가하는 반복문
			var1 ++ ;    // byte 125를 1씩 증가
			var2 ++ ;    // int 125를 1씩 증가
			
			System.out.println("var1 : " + var1 + "    var2 : " + var2);
		}
		
		byte car1 = -125 ;
		int car2 = -125 ;
		for(int i = 0 ; i < 5 ; i++) {   //변수 i를 0~5까지 1씩 증가하는 반복문
			car1 -- ;   // byte 125를 1씩 증가
			car2 -- ;   // int 125를 1씩 증가
			
			System.out.println("car1 : " + car1 + "    car2 : " + car2);
			
			
		}
		

	}

}
