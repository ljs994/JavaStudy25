package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("������ �Է��ϸ� 2�� ������� 3�ǹ������ �˷��帳�ϴ�.");
		System.out.println("=======================");
		System.out.print("���� �Է��ϼ��� : ");
		
		int x = input.nextInt() ;
		
		
		if ( ( x%2==0 ) | ( x%3==0 ) ) {
			System.out.println( x + " = 2�� ��� �Ǵ� 3�� ����� �½��ϴ�." );
		}else { 
			System.out.println( x + " = 2�� ��� �Ǵ� 3�� ����� �ƴմϴ�." );
		
	}

}
}
