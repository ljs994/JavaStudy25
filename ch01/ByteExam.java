package ch01;

public class ByteExam {

	public static void main(String[] args) {
		
		// byte var1 = -128 ;
		// byte var2 = -30 ;
		// byte var3 = 0 ;
		// byte var4 = 30 ;
		// byte var5 = 127 ;
		// byte var6 = 128 ; // ������ �ʰ��Ͽ� ������ �߻��Ѵ�.
		
		byte var1 = 125 ;
		int var2 = 125 ;
		for(int i = 0 ; i < 5 ; i++) {   //���� i�� 0~5���� 1�� �����ϴ� �ݺ���
			var1 ++ ;    // byte 125�� 1�� ����
			var2 ++ ;    // int 125�� 1�� ����
			
			System.out.println("var1 : " + var1 + "    var2 : " + var2);
		}
		
		byte car1 = -125 ;
		int car2 = -125 ;
		for(int i = 0 ; i < 5 ; i++) {   //���� i�� 0~5���� 1�� �����ϴ� �ݺ���
			car1 -- ;   // byte 125�� 1�� ����
			car2 -- ;   // int 125�� 1�� ����
			
			System.out.println("car1 : " + car1 + "    car2 : " + car2);
			
			
		}
		

	}

}
