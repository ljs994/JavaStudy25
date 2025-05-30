package ch05.phone;

public class CellPhone { // 부모 클래스
	protected String model;
	protected String color;
	
	
	protected void powerOn() {System.out.println("전원을 켭니다.");}
	protected void powerOff() {System.out.println("전원을 끕니다.");}
	protected void bell() {System.out.println("벨이 울립니다.");}
	protected void sendVoice(String message) {System.out.println("자기 : " + message);}
	protected void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	protected void hangup() {System.out.println("전화를 끊습니다.");}
	
	
	

}
