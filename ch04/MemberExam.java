package ch04;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		// 회원가입 하는 걸 만들어본다.
		Scanner input = new Scanner(System.in);

		String names[] = null;
		String ids[] = null;
		String pws[] = null;
		MembersGrade grades[] = null;

		// 가입할 회원수를 입력하고 count에 입력된 숫자만큼 names[], ids[], pws[], grades[]의 []안에 들어간다.
		System.out.println("가입할 회원의 수를 입력해주세요.");
		System.out.print(">>> ");
		int count = input.nextInt();
		names = new String[count];
		ids = new String[count];
		pws = new String[count];
		grades = new MembersGrade[count];

		System.out.println("회원가입을 시작 하겠습니다.");
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 : ");
			names[i] = input.next();

			System.out.print("ID : ");
			ids[i] = input.next();

			System.out.print("PW : ");
			pws[i] = input.next();

			System.out.println("등급을 설정하겠습니다. 원하시는 등급 번호를 눌러주세요.");
			System.out.println("1. 손놈");
			System.out.println("2. 회원");
			System.out.println("3. 매니저");
			System.out.println("4. KING");
			System.out.print(">>> ");
			String grade = input.next();
			switch (grade) {
			case "1":
				grades[i] = MembersGrade.GUEST;
				System.out.println("손놈 등급입니다.");
				break;
			case "2":
				grades[i] = MembersGrade.MEMBER;
				System.out.println("회원 등급입니다.");
				break;
			case "3":
				grades[i] = MembersGrade.MANAGER;
				System.out.println("매니저 등급입니다.");
				break;
			case "4":
				grades[i] = MembersGrade.ADMIN;
				System.out.println("KING 등급입니다.");
			default :
				System.out.println("");
			} // switch문 종료
			System.out.println(names[i] + "님 " + grades[i] + "등급으로 가입 되셨습니다.");
		} // for문 종료
		System.out.println("가입 내용입니다.");
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름 : " + names[i]);
			System.out.println("ID : " + ids[i]);
			System.out.println("PW : " + pws[i]);
			System.out.println("등급 : " + grades[i]);
		} // for문 종료
		
	}// main 메서드 종료

}// class 종료
