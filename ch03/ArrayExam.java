package ch03;

public class ArrayExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		// 배열에 들어 있는 값중에 최대값과 최소값을 구해보자

		int[] scores = { 78, 80, 91, 33, 100, 55, 95 };

		int max = scores[0];
		int min = scores[0];
		for (int i = 0; i < scores.length; i++) { // for문 시작
			if (scores[i] > max) { // if문 시작
				max = scores[i];
			} else if (scores[i] < min) {
				min = scores[i];
			} // if문 종료
		} // for문 종료

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	} // main 메서드 종료

} // class 종료
