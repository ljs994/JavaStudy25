package ch02;

import java.util.Scanner;

public class CalcuratorExam { // class 시작
	// 계산기 프로그램 만들기

	public static void main(String[] args) { // main 메서드 시작
		
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0; // 변수 4개를 만듬
		boolean run = true, run2 = true; // while문 블리언을 만듬
		String y1 = "연산기호"; // 정답 표시용
		Scanner inputInt = new Scanner(System.in);
		// int x1~5까지 변수를 만듬
		// while문에 들어갈 boolean타입에 run,run2를 만듬
		while (run) {
			if (x1 == 0) {
				System.out.println("==정수계산기==");
				System.out.println("숫자를 입력하세요.(int 범위 안에서만)");
				System.out.print(">>>> ");
				// System.out.print("**정수계산기**\n숫자를 입력해주세요(int 범위 내에서만)\n>>");
				// 이렇게 사용해도 똑같이 나온다
				x1 = inputInt.nextInt();
			}
			System.out.println("부호를 선택하세요.");
			System.out.println("1. +(더하기)");
			System.out.println("2. -(빼기)");
			System.out.println("3. x(곱하기)");
			System.out.println("4. ÷(나누기)");
			// System.out.print("부호를 선택해주세요\n1.+(더하기)\t2.-(빼기)\n3.(곱하기)\t4.(나누기)\n>>");
			// 여기서 \t는 tap키를 말한다.
			// 이렇게 사용하면 보기 편하다.(사용가능)
			x2 = inputInt.nextInt();
			System.out.println("숫자를 입력해주세요(int 범위 안에서만)");
			System.out.print(">>> ");
			x3 = inputInt.nextInt();
			run2 = true;
			switch (x2) {
			case 1:
				x4 = plus(x1, x3);
				y1 = "+";
				break;
			case 2:
				x4 = minus(x1, x3);
				y1 = "-";
				break;
			case 3:
				x4 = times(x1, x3);
				y1 = "x";
				break;
			case 4:
				x4 = divide(x1, x3);
				y1 = "÷";
				break;
			} // switch (x2)문 종료
			System.out.println("계산결과 : " + x1 + " " + y1 + " " + x3 + " = " + x4);
			while (run2) {
				if (x4 != 0) {
					System.out.println("1.종료하기");
					System.out.println("2.다시하기");
					System.out.println("3.이어서 계산하기");
					System.out.print(">>>>");
				} else {
					System.out.println("1.종료하기");
					System.out.println("2.다시하기");
					System.out.print(">>>>");
				}
				x5 = inputInt.nextInt();
				switch (x5) {

				case 2:
					x1 = 0;
					x2 = 0;
					x3 = 0;
					run2 = false;
					break;
				case 3:
					x1 = x4;
					x2 = 0;
					x3 = 0;
					run2 = false;
					break;
				case 1:
					run = false;
					run2 = false;
					break;
				default:
					System.out.println("숫자를 잘못 선택하셨습니다.");
					System.out.println("다시 입력 해주세요.");
					System.out.print(">>>");
				} // switch (x5)문 종료
			} // while (run2)문 종료
		} // while (run)문 종료

	} // main 메서드 종료

	private static int divide(int x1, int x3) { // static int divide(int x1, int x3)문 시작
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	} // static int divide(int x1, int x3)문 종료

	private static int times(int x1, int x3) { // static int times(int x1, int x3)문 시작
		int x4 = 0;
		x4 = x1 * x3;
		return x4;
	} // static int times(int x1, int x3)문 종료

	static int minus(int x1, int x3) { // static int minus(int x1, int x3)문 시작
		int x4 = 0;
		x4 = x1 - x3;
		return x4;
	} // static int minus(int x1, int x3)문 종료

	static int plus(int x1, int x3) { // static int plus(int x1, int x3)문 시작
		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	} // static int plus(int x1, int x3)문 종료

} // class 종료
