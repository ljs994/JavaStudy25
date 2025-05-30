package ch04.television;

public class Television {
	// 1번 예시
	
	static String company = "SamSung";
	static String model = "LED";
	static String info;
	
	 static {
		 info = company + "-" + model;
	 }
	
	// 2번 예시
	int field1 ;
	void method1 () {
	}
	
	static int field2;
	static void method2() {
	}
	static {
		// field1 = 10; // 인스턴스 필드 사용불가
		// method1(); // 인스턴스 메서드 사용불가
		field2 = 20;
		method2();
	}
	static void Method3() {
		// this.field1 = 10; // 컴파일 오류
		// this.method1(); // 컴파일 오류
		field2 = 10;
		method2();
	}
	static void Method4() { // 2번 예시중 주석처리 한 건 에러가 뜨는 경우이고 Method4처럼 new를 사용해야 한다.
		Television tel = new Television();
		tel.field1 = 10;
		tel.method1();
	}
	
	
	
}
