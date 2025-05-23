package ch04;

import java.util.Calendar;

public class EnumWeekExam2 {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY;
			break;
		case 2 :
			today = Week.MONDAY;
			break;
		case 3 :
			today = Week.TUESDAY;
			break;
		case 4 :
			today = Week.WEDNESDAY;
			break;
		case 5 :
			today = Week.THURSDAY;
			break;
		case 6 :
			today = Week.FRIDAY;
			break;
		case 7 :
			today = Week.SATURDAY;
			break;
		}
		System.out.println("현재 날짜는 " + year + "년 " + month + "월 " + day + "일(" + today + ")");
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재시간은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일입니다. 열심히 집안일을 하세요.");
		}else if(today == Week.MONDAY) {
			System.out.println("월요일입니다. 자바공부를 합시다.");
		}else if(today == Week.TUESDAY) {
			System.out.println("화요일 입니다. 오라클db공부를 합시다.");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("수요일 입니다. jsp공부를 합시다.");
		}else if(today == Week.THURSDAY) {
			System.out.println("목요일 입니다. 클라우드공부를 합시다.");
		}else if(today == Week.FRIDAY) {
			System.out.println("금요일 입니다. 파이썬공부를 합시다.");
		}else if(today == Week.SATURDAY) {
			System.out.println("토요일 입니다. 잠을 잡시다.");
		}
		
	} //main 메서드 종료

} // class 종료
