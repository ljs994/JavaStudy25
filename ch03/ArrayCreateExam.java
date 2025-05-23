package ch03;

public class ArrayCreateExam {

	public static void main(String[] args) {
		int[] scores = {83,90,87} ;
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0 ;
		for(int i = 0 ; i < 3 ; i++ ) {
			sum = sum + scores[i] ;
		} //for문 종료
		
		System.out.println("총점 : " + sum);
		double avg = (double)sum / 3 ;
		System.out.println("평균 : " + avg);

	} // main 메서드 종료

} // class 종료
