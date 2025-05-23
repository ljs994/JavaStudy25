package ch04;

public class Circle {
	
	// 필드(클래스에서 사용될 변수)
	public int radius; 
	public String name;
	
	
	
	// 생성자(클래스를 호출할때 new 연산자 사용)
	public Circle() {
		// main 메서드에서 Circle circle = new Circle(); ->사용됨
	}
	
	
	
	// 메서드
	public double getArea() {
		return 3.14*radius*radius;
	}

}
