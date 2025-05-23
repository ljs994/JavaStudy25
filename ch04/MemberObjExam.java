package ch04;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		// Member class를 호출해서 처리

		Scanner input = new Scanner(System.in);
		Member[] members = null;

		System.out.println("가입할 회원은 몇명인가요>");
		System.out.print(">>> ");
		int count = input.nextInt();
		members = new Member[count];
		// 설명 : 처음 members 값을 null처리를 한 후에 가입할 회원수를 count에 입력 후 new Member[] []안에 count를
		// 집어 넣는다.

		System.out.println("===========================================");
		System.out.println("회원가입을 시작하겠습니다");
		boolean run = true;

		while (run) {
			System.out.println("**********주의사항(1~5가 아닌 다른 키를 입력하면 프로그램이 강제 종료 됩니다.**********");
			System.out.println("1. 회원가입");
			System.out.println("2. 전체회원 보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.println("**********주의사항(1~5가 아닌 다른 키를 입력하면 프로그램이 강제 종료 됩니다.**********");
			System.out.print(">>>> ");
			int select = input.nextInt(); // 초기 메뉴를 보여줌

			// switch문 만들고의 순서 case1번 예시
			// Member member1 = new Member();
			// member1.memberAdd();
			// break;

			// 1. member1.memberAdd(); 이 부분에 input을 넣어 Member.java에 scanner를 보낸다.
			// 2.ㄴ

			switch (select) {
			case 1:
				Member member1 = new Member();
				for (int i = 0; i < members.length; i++) {
					member1 = member1.memberAdd(input);
					members[i] = member1;
				}
				break;
			case 2:
				Member member2 = new Member();
				member2.memberList(members);
				break;
			case 3:
				Member member3 = new Member();
				for(int i = 0 ; i < members.length; i ++) {
					member3.memberLogin(input, members);	
				}
				break;
			case 4:
				Member member4 = new Member();
				member4.memberUpdate();
				break;
			case 5:
				Member member5 = new Member();
				member5.memberDeleat();
				break;
			default:
				System.out.println("프로그램을 종료합니다");
				run = false;
			}

		}

	}

}
