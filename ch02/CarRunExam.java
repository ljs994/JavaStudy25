package ch02;

import java.util.Scanner;

public class CarRunExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작

		Scanner input = new Scanner(System.in);

		boolean run = true;
		int speed = 0;
		final int MAXSPEED = 300;
		final int MINSPEED = 0;

		System.out.println("당신의 차가 입고 되었습니다.");
		System.out.println("시동을 켭니다");
		System.out.println("현재 속도 = " + speed + "km/h");

		while (run) {
			System.out.println("==========================");
			System.out.println("0. 시동 종료");
			System.out.println("1. 액셀");
			System.out.println("2. 브레이크");
			System.out.println("3. 멀티미디어");
			System.out.println("4. 주유하기");
			System.out.println("==========================");
			System.out.print("0~4숫자만 입력하세요 : ");

			int select = input.nextInt();
			switch (select) {
			case 0:
				System.out.println("시동을 종료합니다.");
				run = false;
				break;
			case 1:
				System.out.println("액셀을 밟으셨습니다.");
				speed += 20;
				if (speed >= MAXSPEED) {
					speed = MAXSPEED;
				}
				System.out.println("현재 속도 = " + speed + "km/h");
				break;
			case 2:
				System.out.println("브레이크를 밟으셨습니다.");
				speed -= 10;
				if (speed <= MINSPEED) {
					speed = MINSPEED;
				}
				System.out.println("현재 속도 = " + speed + "km/h");
				break;
			case 3:
				System.out.println("멀티미디어를 실행합니다.");
				break;
			case 4:
				System.out.println("주유를 진행합니다.");
				break;

			} // switch 문 종료
		} // while 문 종료
		System.out.println("당신의 자동차가 사라집니다.");

	} // main 메서드 종료

} // class 시작
