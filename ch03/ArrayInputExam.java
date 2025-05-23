package ch03;

import java.util.Scanner;

public class ArrayInputExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		// 배열 연습
		Scanner inputInt = new Scanner(System.in);
		boolean run = true;

		System.out.println("==== 엠비씨 아카데미 성적처리 메뉴에 오신걸 환영합니다. ====");
		System.out.println("학생수를 입력해 주세요");
		System.out.print(">>> ");
		int count = inputInt.nextInt();
		System.out.println(count + "명으로 확인 되었습니다.");

		String[] names = new String[count];
		int[] kors = new int[count];
		int[] mats = new int[count];
		int[] engs = new int[count];

		while (run) {
			System.out.println("==== 성적처리 메뉴 ====");
			System.out.println("1. 성적입력");
			System.out.println("2. 전체성적 보기");
			System.out.println("3. 개인성적 보기");
			System.out.println("4. 성적수정 하기");
			System.out.println("5. 성적삭제 하기");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>> ");
			int select = inputInt.nextInt();

			switch (select) {
			case 1:
				System.out.println("성적입력 메뉴 입니다.");
				scoreAdd(names, kors, mats, engs);
				break ;
			}

		}

	} // main 메서드 종료

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) { // 성적입력 메서드 시작
		// 성적입력 메뉴
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		

	} // 성적입력 메서드 종료

} // class 종료
