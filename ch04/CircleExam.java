package ch04;

public class CircleExam {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		circle.name = "이재상";
		circle.radius = 20 ;
		
		double result = circle.getArea();
		
		System.out.println("원의 넓이 : " + circle.radius + "는 " +  result + "입니다.");
		System.out.println("작성자 : " + circle.name);
		
		
		
	}

}
