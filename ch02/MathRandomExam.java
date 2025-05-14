package ch02;

public class MathRandomExam { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		
		int num = (int) (Math.random() * 6) +1 ; // 1~6까지의 난수를 발생 시킨다.
		
		System.out.println("주사위의 값 " + num);
		
		if (num == 1) { // num이 1일때
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) { // num이 2일때
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) { // num이 3일때
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) { // num이 4일때
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) { // num이 5일때
			System.out.println("5번이 나왔습니다.");
		} else if (num == 6) { // num이 6일때
			System.out.println("6번이 나왔습니다.");
		}		

	} // main 메서드 종료

} // class종료
