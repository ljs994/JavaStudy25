package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		
		String loginid = "ljs" ;
		String loginpw = "1234" ;
		
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("�α��� �� ���̵� �Է��ϼ��� : ");
		String id = input.nextLine() ;
		System.out.println("�Է��Ͻ� id�� : " +id + " �Դϴ�. ");
		
		System.out.print("�α��� �� ��й�ȣ�� �Է��ϼ��� : ");
		String pw = input.nextLine() ;
		System.out.println(" ==== ���� ���Դϴ�. ====");
		
		if( (loginid.equals(id)) & loginpw.equals(pw) ) {
			
			System.out.println("id�� pw�� ��ġ�մϴ�.");
			System.out.println("�α��� ����");
			
		} else {
			System.out.println("id�� pw�� �ٸ��ϴ�.");
			System.out.println("�α��� ����");
			
		}
		
		
		
		

	}

}
