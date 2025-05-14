package ch02;

import java.util.Scanner;

public class IfExam { // class 시작

	public static void main(String[] args) { // main 메서드시작

		Scanner in = new Scanner(System.in);

		System.out.println("당신의 이름을 입력하세요");
		System.out.print("= ");
		String name = in.next();

		System.out.println("당신의 국어 점수를 입력하세요");
		System.out.print("= ");
		int kor = in.nextInt();

		if (kor > 0 && kor <= 100) { // kor점수에 대한 if문 시작
			if (kor >= 90) {
				System.out.println(name + "님의 국어 점수는 " + kor + "점 입니다.");
				System.out.println(kor + "점은 A등급 입니다.");
			} else if (kor >= 80) {
				System.out.println(name + "님의 국어 점수는 " + kor + "점 입니다.");
				System.out.println(kor + "점은 B등급 입니다.");
			} else if (kor >= 70) {
				System.out.println(name + "님의 국어 점수는 " + kor + "점 입니다.");
				System.out.println(kor + "점은 C등급 입니다.");
			} else if (kor >= 60) {
				System.out.println(name + "님의 국어 점수는 " + kor + "점 입니다.");
				System.out.println(kor + "점은 D등급 입니다.");
			} else {
				System.out.println(name + "님의 국어 점수는 " + kor + "점 입니다.");
				System.out.println("59점 이하는 F등급 입니다.");
			}
		} // kor if문 종료

			System.out.println("당신의 수학 점수를 입력하세요.");
			System.out.print("= ");
			int mat = in.nextInt();

			if (mat > 0 && mat <= 100) { // mat if문 시작
				if (mat >= 90) {
					System.out.println(name + "님의 수학 점수는 " + mat + "점 입니다.");
					System.out.println(mat + "점은 A등급 입니다.");
				} else if (mat >= 80) {
					System.out.println(name + "님의 수학 점수는 " + mat + "점 입니다.");
					System.out.println(mat + "점은 B등급 입니다.");
				} else if (mat >= 70) {
					System.out.println(name + "님의 수학 점수는 " + mat + "점 입니다.");
					System.out.println(mat + "점은 C등급 입니다.");
				} else if (mat >= 60) {
					System.out.println(name + "님의 수학 점수는 " + mat + "점 입니다.");
					System.out.println(mat + "점은 D등급 입니다.");
				} else {
					System.out.println(name + "님의 수학 점수는 " + mat + "점 입니다.");
					System.out.println("59점 이하는 F등급 입니다.");
				}
			} // mat if문 종료
			
			System.out.println("당신의 영어 점수를 입력하세요.");
			System.out.print("= ");
			int eng = in.nextInt();

			if (eng > 0 && eng <= 100) { // eng if문 종료
				if (eng >= 90) {
					System.out.println(name + "님의 영어 점수는 " + eng + "점 입니다.");
					System.out.println(eng + "점은 A등급 입니다.");
				} else if (eng >= 80) {
					System.out.println(name + "님의 영어 점수는 " + eng + "점 입니다.");
					System.out.println(eng + "점은 B등급 입니다.");
				} else if (eng >= 70) {
					System.out.println(name + "님의 영어 점수는 " + eng + "점 입니다.");
					System.out.println(eng + "점은 C등급 입니다..");
				} else if (eng >= 60) {
					System.out.println(name + "님의 영어 점수는 " + eng + "점 입니다.");
					System.out.println(eng + "점은 D등급 입니다.");
				} else {
					System.out.println(name + "님의 영어 점수는 " + eng + "점 입니다.");
					System.out.println("59점 이하는 F등급 입니다.");
				}
			} // eng if문 종료
			int total = (kor + mat + eng) ;
			System.out.println("당신의 총점을 구하시겠습니까?");
			System.out.print("대답  : ");
			String answer = in.next() ;			
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println(name + "님의 총점은 " + total + "점 입니다.");
			}else {
				System.out.println("다시 대답해주세요.");
			}
			
	} // main 메서드 종료
} // class 종료