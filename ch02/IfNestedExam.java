package ch02;

import java.util.Scanner;

public class IfNestedExam { // class시작

	public static void main(String[] args) { // main 메서드 시작
		// 0~100점 까지 사이값을 랜덤으로 만들어 등급을 나누어 본다.
		Scanner in = new Scanner(System.in) ;
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = in.next() ;
		
		int score = (int)(Math.random()*101) ;
		System.out.println(name + "님의 점수는 : " + score + "점 입니다.");
		String grade ;
		if (score>=90) {
			if (score>=95) {
				grade = "A+" ;
		} else {
			grade = "A" ;
		}
			
		} else {
			if (score>=80) {
				if (score >= 85) {
					grade = "B+" ;
				}else {
					grade = "B" ;
				}
			} else {
				if (score>=70) {
					if (score>=75) {
						grade = "C+" ;
					}else {
						grade = "C" ;
					}
				} else {
					if (score>=60) {
						if (score>=65) {
							grade = "D+" ;
						}else {
							grade = "D" ;
						}
				} else {
					grade = "F" ;
				}
				}
				
			}
			
		}
		
		System.out.println("학점 : " + grade);
		
		
		
		
		
		
	} // main 메서드 종료

} // class 종료
