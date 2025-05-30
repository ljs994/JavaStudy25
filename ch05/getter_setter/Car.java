package ch05.getter_setter;

public class Car {
	// 값을 제공할 때는 setter
	// 값을 받을 때는 getter
	
	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	
	
	// 메서드
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	
	

}
