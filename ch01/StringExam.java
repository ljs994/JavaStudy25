package ch01;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("�̸��� �Է��Ͻÿ�. : ");
		String name = input.nextLine() ;
		System.out.print("���̸� �Է��Ͻÿ� : ");
		String age = input.nextLine() ;
		System.out.print("�ڵ��� ��ȣ�� �Է��Ͻÿ� : ");
		String pnum = input.nextLine() ;
		
		System.out.println(name + "�� ������ ���� �����մϴ�. ���� �� ���Կ�^^");
		System.out.println("����� ���̴� " + age + "�� �̳׿�");
		System.out.println(pnum + " �� ��ȣ�� ���� �������� ����ϰڽ��ϴ�^^");
		

	}

}
