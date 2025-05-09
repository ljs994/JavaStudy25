package ch01;

public class PrintfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 99 ;
		String s = "Java" ;
		double d = 8.96 ;
		
		System.out.printf("%d\n" , i ); // 10진수
		System.out.printf("%o\n" , i ); // 8진수
		System.out.printf("%x\n" , i ); // 16진수
		System.out.printf("%c\n" , i ); // char
		System.out.printf("%5d\n" , i );
		System.out.printf("%05d\n" , i );
		System.out.printf("%s\n" , s );
		System.out.printf("%5s\n" , s );
		System.out.printf("%-5s\n" , s );
		System.out.printf("%f\n" , d );
		System.out.printf("%e\n" , d );
		System.out.printf("%5.1f\n" , d );
		System.out.printf("%05.1f\n" , d );
		System.out.printf("%-4.1f\n" , d );
		
		

	}

}
