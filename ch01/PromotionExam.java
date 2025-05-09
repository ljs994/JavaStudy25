package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// 자동 타입 변환 연습
				// : 작은 타입 값을 손실 없이 큰 타입 값으로 변환 한다.
				// byte(1byte : 8bit)
				// short(2byte : 16bit) & char(유니코드용 : 문자표현)
				// int(4byte : 32bit)
				// long(8byte : 64bit)  // 접미사 L
				// float(4byte : 32bit) // 실수형 접미사F
				// double(8byte : 64bit)
				
				byte byteValue = 75 ; 
				int intValue = byteValue ; 
				
				System.out.println("자동타입 된 int : " + intValue );
				
				char charValue = '다' ;
				intValue = charValue ;
				System.out.println("자동타입 된 int : " + intValue);
				
				
				intValue = 369 ;
				long longValue = intValue ;
				System.out.println("자동타입 된 long : " + longValue);
				
				intValue = 123 ;
				double doubleValue = intValue ;
				System.out.println("자동타입 된 double : " + doubleValue );
				

	}

}
