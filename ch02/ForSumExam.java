package ch02;

import java.util.Scanner;

public class ForSumExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		// 1부터 100까지의 합을 구한다.
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("몇부터 몇까지의 합을 구하고 싶은지 말하시오");
		System.out.print("최소값 : ");
		int min = input.nextInt() ;
		System.out.print("최대값 : ");
		int max = input.nextInt() ;
		
		int sum = 0 ;
		
		for(int i = min ; i <= max ; i++) {
			sum = sum+i ;
		}
		System.out.println(min + " ~ " + max +"까지의 합 : " + sum);
		

	} // main 메서드 종료

} // class 종료
