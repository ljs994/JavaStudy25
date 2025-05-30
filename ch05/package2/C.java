package ch05.package2;

import ch05.package1.A;

public class C {
	// 필드
	A a1 = new A(true);		// public접근이라 에러가 안뜸
	//A a2 = new A(1); 		// default접근이라 다른 package이므로 에러가 뜬다
	//A a3 = new A("문자열"); 	// private접근이라 에러가 뜬다
	
	// public : 전체접근이 가능하다.
	// default : 같은 package만 접근이 가능하다.
	// private : 본인을 제외한 전체가 접근 제한이다.
	
	
	
	// 생성자
	
	
	
	
	// 메서드

}
