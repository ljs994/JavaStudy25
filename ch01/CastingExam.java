package ch01;

public class CastingExam {

	public static void main(String[] args) {
		
		int intValue = 98572454 ;
		byte byteValue = (byte) intValue ;
		System.out.println(intValue);
		System.out.println(byteValue);
		
		int i = 128 ;
		
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println(Byte.MIN_VALUE + "������ �۰ų�");
			System.out.println(Byte.MAX_VALUE + "������ Ů�ϴ�.");
		} else {
			byte b = (byte) i ;
			System.out.println(b);
		}

	}

}
