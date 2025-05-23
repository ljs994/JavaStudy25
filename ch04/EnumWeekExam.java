package ch04;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {
		// enum과 내장된 객체(달력)을 연결하여
		// 날짜를 출력해보자.
		
		Week today = null;
		//타입  변수 =  빈값;
		
		Calendar calendar = Calendar.getInstance();
		// 타입      변수   	   객체  .  메서드
		//캘린더 타입에 객체가 만들어지면서 calendar변수에 연결된다.
		
		int year = calendar.get(Calendar.YEAR);
		//정수타입의 year변수에 캘린더에서 가져온 연도값을 넣는다.
		System.out.println("올해 연도는 : " + year);
		
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println("현재 월은 : " + month + "월 입니다.");
		//MONTH는 +1을 해야된다.
		
		
	}

}
