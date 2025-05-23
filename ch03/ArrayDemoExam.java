package ch03;

import java.util.Scanner;

public class ArrayDemoExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작

		Scanner inputInt = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;

		for (int i = 0; i < scores.length; i++) { // for문 시작
			scores[i] = inputInt.nextInt();
		} // for문 종료

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + sum / (double) scores.length);

	} // main 메서드 종료

} // class 종료
