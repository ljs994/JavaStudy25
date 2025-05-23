package ch03;

public class ArrayLangthExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		int[] scores = new int[] {70,80,90};
		
		int sum = add(scores) ;
		System.out.println("총합 : " + sum);
		
		double avg = avg(sum, scores) ;
		System.out.println("평균 : " + avg);
		
	} // main 메서드 종료

	static double avg(int sum, int[] scores) { // avg 메서드 시작
		double avg = (double) sum / scores.length ;
	return avg;
} // avg 메서드 종료

	static int add(int[] scores) { // add 메서드 시작
		int sum = 0;
		System.out.println("현재 인원은 : " + scores.length);
		for(int i = 0 ; i < scores.length ; i++) { // for문 시작
			sum = sum + scores[i] ;
		} // for문 종료
		return sum;
	} // add 메서드 종료

} // class 종료
