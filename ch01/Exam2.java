package ch01;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("���ڸ� �Է��Ͻÿ� ");
		int num = input.nextInt() ;
		System.out.println(num % 2 == 0 ?  "¦�� "  :  "Ȧ��");

	}

}
