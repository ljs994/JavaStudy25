package ch04;

import java.util.Scanner;

public class Member {
	
	// 필드 생성
	public int mno ;
	public String id ;
	public String pw ;
	
	// 생성자 생성
	public Member() {
		
	}
	
	// 메서드 생성
	public Member memberAdd(Scanner input) { // 회원가입용 메서드 생성
		Member memberAdd = new Member();
		System.out.println("회원가입용 메서드입니다.");
		System.out.println("========================================");
		System.out.println("사용하실 회원 번호를 입력해주세요.");
		System.out.print(">>> ");
		memberAdd.mno = input.nextInt();
		
		System.out.println("사용하실 ID를 입력해주세요.");
		System.out.print(">>> ");
		memberAdd.id = input.next();
		
		System.out.println("사용하실 PW를 입력해주세요.");
		System.out.print(">>>");
		memberAdd.pw = input.next();
		
		return memberAdd ;
		
	} // 회원가입용 메서드 종료
	public void memberList(Member[] members) { // 회원 전체보기 메서드 생성
		System.out.println("회원 전체보기 메서드 입니다.");
		System.out.println("========================================");
		for(int i = 0; i<members.length; i++) {
			System.out.println("회원 번호 : " + members[i].mno);
			System.out.println("회원 ID : " + members[i].id);
			System.out.println("회원 PW : " + members[i].pw);
			System.out.println("========================================");
		}
	} // 회원 전체보기 메서드 종료
	public Member memberLogin(Scanner input, Member[] members) { // 로그인 메서드 생성
		Member memberLogin = new Member();
		System.out.println("로그인 메서드 입니다.");
		System.out.println("========================================");
		System.out.print("ID : ");
		String ids = input.next();
		System.out.print("PW : ");
		String pws = input.next();
		for(int i = 0; i<members.length; i++) {
			if(ids.equals(members[i].id) && pws.equals(members[i].pw)) { // id pw 둘다 일치
				System.out.println("로그인에 성공하셨습니다.");
				break ;
			}else if(ids.equals(members[i].id) && !pws.equals(members[i].pw)) { // pw만 틀릴 경우
				System.out.println("비밀번호를 다시 확인해주세요.");
				break;
			}else if(!ids.equals(members[i].id) && pws.equals(members[i].pw)) { // id만 틀릴 경우
				System.out.println("아이디를 다시 확인해주세요.");
				break;
			}else {
				System.out.println("해당 계정은 없는 계정입니다.");
			}
			return memberLogin;
		}
		return memberLogin;
	} // 로그인 메서드 종료
	public void memberUpdate() { // 회원정보 수정 메서드 생성
		System.out.println("회원정보 수정 메서드 입니다.");
		System.out.println("========================================");
	} // 회원정보 수정 메서드 종료
	public void memberDeleat() { // 회원탈퇴 메서드 생성
		System.out.println("회원탈퇴 메서드 입니다.");
		System.out.println("========================================");
	} // 회원탈퇴 메서드 종료
	

}
