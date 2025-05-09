package ch01;

public class CastingExam {

	public static void main(String[] args) {
		
		int intValue = 98572454 ;
		byte byteValue = (byte) intValue ;
		System.out.println(intValue);
		System.out.println(byteValue);
		
		int i = 128 ;
		
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println(Byte.MIN_VALUE + "값보다 작거나");
			System.out.println(Byte.MAX_VALUE + "값보다 큽니다.");
		} else {
			byte b = (byte) i ;
			System.out.println(b);
		}

	}

}
