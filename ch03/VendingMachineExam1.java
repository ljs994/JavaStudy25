package ch03;

import java.util.Scanner;

public class VendingMachineExam1 { // class 시작

	public static void main(String[] args) { // main 메서드 시작
		String pw = "1234";
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		boolean run = true ;
		
		String[] snack = {"스윙칩", "포카칩", "썬칩"} ;
		int[] count = {10, 10, 10} ;
		int[] price = {1500, 2000, 2500} ;
		

		System.out.println("과자 자판기 입니다.");
		System.out.println("1. 남은 종류,수량 보기\t 2. 메뉴 선택\t 9. 종료하기");
		System.out.print(">>> ");
		int select = inputInt.nextInt();

		System.out.println(select + "번 화면으로 이동합니다.");
		
		while (run) {
			if (select == 1) {
				System.out.println("과자 종류입니다.");
				
				System.out.println(snack[0] + " " + count[0] + "개 " + snack[1] + " " + count[1] + "개 " + snack[2] + " "
						+ count[2] + "개");
			}
			if (select == 2) {
				System.out.println("선택하실 과자를 선택해주세요.");
				System.out.println("1. " + snack[0] + " 2. " + snack[1] + " 3. " + snack[2]);
			}
			if (select == 9) {
				System.out.println("프로그램을 종료합니다.");
				run = false ;
			}
			if (select == 99) {
				System.out.println("관리자 페이지입니다.");
				System.out.println("관리자 확인을 위해 비밀번호를 입력해 주세요.");
				System.out.print("PW : ");
				int pass = inputInt.nextInt();
				if (pw.equals(pass)) {
					System.out.println("확인");
				} else {
					System.out.println("비밀번호가 다릅니다.");
				}
			}
		} // 반복문 종료
		
	}

} // class 종료
