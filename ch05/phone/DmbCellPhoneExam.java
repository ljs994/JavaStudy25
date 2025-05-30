package ch05.phone;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("디앰비폰", "빨강", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		System.out.println("체널번호 : " + dmbCellPhone.channel);
		System.out.println("----------------------------------");
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 이재상입니다.");
		dmbCellPhone.sendVoice("반갑습니다.");
		dmbCellPhone.receiveVoice("테스트 종료합니다. 수고하세요");
		dmbCellPhone.hangup();
		System.out.println("----------------------------------");
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(9);
		dmbCellPhone.turnOffDmb();
		
		
		
	}

}
