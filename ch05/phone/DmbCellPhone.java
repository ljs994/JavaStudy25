package ch05.phone;

public class DmbCellPhone extends CellPhone{ // 자식 클래스
	
	//필드
	protected int channel; // 자식 필드 추가

	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model; // 부모필드
		this.color = color;
		this.channel = channel; // 자식필드
	}
	
	// 메서드
	protected void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB방송 수신을 시작하겠습니다.");
	}
	
	protected void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을" + channel + "번으로 변경합니다.");
	}
	
	protected void turnOffDmb() {
		System.out.println("DMB 방송 수신을 중지합니다.");
	}
	
	

}
