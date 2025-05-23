package ch03;

public class ArrayCreateExam2 { // class시작

	public static void main(String[] args) { // main 메서드 시작

		int total1 = add(new int[] { 70, 80, 90 });
		int total2 = add(new int[] { 60, 70, 80 });
		int total3 = add(new int[] { 50, 60, 70 });
		
		System.out.println("1번의 총합 : " + total1);
		System.out.println("2번의 총합 : " + total2);
		System.out.println("3번의 총합 : " + total3);

	} // main 메서드 종료

	private static int add(int[] scores) { // 총합 메서드 시작
		
		int sum = 0 ;
		for(int i = 0 ; i < 3 ; i++) { // for문 시작
			sum = sum + scores[i];
		} // for문 종료
		
		return sum;
	} // 총합 메서드 종료

} // class 종료
