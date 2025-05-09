package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		int x = 10 ;
		char y = 80 ;
		char z = 'A' ;
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);

		int x1 ;
		x1 = 85 ;
		
		System.out.println(x1);
		
		char y1 ;
		y1 = 65 ;
		
		System.out.println(y1);
		
		int kor, mat, eng, total, avg ;
		kor = 80 ;
		mat = 70 ;
		eng = 60 ;
		total = kor + mat + eng ;
		avg = total / 3 ;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		char firstname = '야' ;
		char firstName = '호' ;
		
		System.out.println("답 : " + firstname );
		System.out.println("답 : " + firstName );
		
		int litera11 = 75 ;
		int litera12 = 075 ;
		int litera13 = 0b0011 ;
		int litera14 = 0xA ;
		
		System.out.println("10진수 75 : " + litera11);
		System.out.println("8진수 075 : " + litera12);
		System.out.println("2진수 0011 : " + litera13);
		System.out.println("16진수 A : " +litera14);
		
		
		
	} // 메서드 종료

}
