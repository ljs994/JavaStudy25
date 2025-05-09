package ch01;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  = new Scanner(System.in) ;
		int x = in.nextInt() ;
		int y  = in.nextInt() ;
		System.out.printf("%d * %d은 %d 입니다.\n", x , y , x * y );
		
		

	}

}
