package ch01;

import java.util.Scanner;

public class LogicPrintfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("�̸� : ");
		String name = input.next() ;
		
		System.out.print("���� : ");
		int age = input.nextInt();
		
		System.out.print("���� : ");
		String a = input.next() ;
		
		System.out.printf("���� ����� �̸��� %s\n ����� ���̴�%d\n ������ %s\n �Դϴ�.", name , age , a);
		
		

	}

}
