package ch04;

import java.util.Scanner;

public class Car {
	// 필드 (객체가 가지고 있어야 하는 값) -> 글로벌변수(GV)
	// 고유 데이터
	public String company; // 제조회사(현대,기아,KGM,쉐보레, 등등)
	public String model; // 모델(아반떼, 그랜져, 쏘나타 등등)
	public String color; // 색깔
	public int maxSpeed; // 최고속도
	public String oilType; // 기름 타입(휘발유, 경유)

	// 상태값(변동가능)
	public int speed;
	public int rpm;
	public int oil;

	// 부품 -> 다른 클래스를 생성하여 연결한다.
//	public Body body ;
//	public Engine engine;
//	public Tire tire ;

	// 부품에 필드 사용법
	// Car myCar= new Car(); -> 객체 생성(인스턴스)
	// myCar.maxSpeed = 300; -> 객체에 있는 maxSpeed에 300정수를 넣는다.
	// ------------------------------------------------------------

	// 기본생성자 : 생략가능 (객체가 생성할 때 사용되는 메서드 : 클래스명과 같은 이름)
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 100;
	} // 객체가 생성되면서 변수에 값이 저정됨.

	// 사용자 지정 생성자 -> 개발자가 응용하는 기법
	// 사용자 지정 생성자가 만들어지면 기본 생성자는 자동으로 생성되지 않는다.
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	} // Car myCar = new Car("벤츠","이클레스","빨강") ;

	// 메서드 (객체가 수행해야 되는 동작)
	// C(시동을건다) R(차량상태, 주행상태) U(가속, 감속, 주차) D(시동종료)
	public void start() {
		System.out.println(this.model + "이(가) 주행을 시작합니다.");
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 rpm : " + rpm);
		System.out.println("현재 주유량 : " + oil);
	} // start 메서드 종료

	public void speed(Scanner input) {

		final int MAXSPEED = 300;
		final int MINSPEED = 0;
		final int MAXOIL = 100;
		final int MINOIL = 0;

		boolean run = true;
		while (run) {
			System.out.println("1. 액셀");
			System.out.println("2. 브레이크");
			System.out.println("3. 주요하기");
			System.out.println("4. 뒤로가기");
			System.out.print(">>> ");
			int select = input.nextInt();
			switch (select) {
			case 1: // 액셀 메뉴

				this.speed += 20;
				this.oil -= 10;
				if (this.speed >= MAXSPEED) {
					this.speed = MAXSPEED;
					System.out.println("*****차량 속도가 최고 속도에 도달하였습니다.*****");
					System.out.println("*****속도를 강제로 줄이겠습니다.*****");
					this.speed -= 50;
					System.out.println("현재 속도는 : " + this.speed);
				} else if (this.oil <= MINOIL) {
					this.speed = MINSPEED;
					this.oil = MINOIL;
					System.out.println("기름이 없어 자동차를 운행할 수 없습니다.");
					System.out.println("기름을 넣어주세요.");
				} // 최고 속도에 왔을때, 기름이 없을때 if문 종료
				System.out.println("현재 속도는 : " + this.speed + "\t 기름양은 : " + this.oil);
				break;
			case 2: // 브레이크 메뉴
				this.speed -= 10;
				if (this.speed <= MINSPEED) {// 최저 속도에 왔을때 if문 종료
					this.speed = MINSPEED;
					System.out.println("*****차량이 멈췄습니다.*****");
					System.out.println("현재 속도는 : " + this.speed);
					break;
				} else if (this.oil <= MINOIL) {
					this.speed = MINSPEED;
					this.oil = MINOIL;
					System.out.println("기름이 없어 자동차를 운행할 수 없습니다.");
					System.out.println("기름을 넣어주세요.");
					break;
				} // 최저 속도에 왔을때 if문 종료
				System.out.println("현재 속도는 : " + this.speed + "\t 기름양은 : " + this.oil);
				break;
			case 3:
				this.oil += 10;
				if (this.oil >= MAXOIL) {
					this.oil = MAXOIL;
					System.out.println("현재 기름 양은 : " + this.oil + "입니다.");
					System.out.println("기름이 넘칩니다. 돈을 땅에 버리시는군요.");
					break;
				} // 기름 최대량에 도달했을때 if문 종료
				System.out.println("주유를 시작하겠습니다.");
				System.out.println("=====주유중입니다.=====");
				System.out.println("주유후 기름양은 : " + this.oil + "입니다.");
				System.out.println("=====주유가완료되었습니다.=====");
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("해당 메뉴는 없는 메뉴입니다.");
			} // switch문 종료

		} // while문 종료

	}// speed 메서드 종료

}
