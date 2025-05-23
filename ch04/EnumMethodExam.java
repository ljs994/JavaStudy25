package ch04;

public class EnumMethodExam {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		
		// name() 메소드
		String name = today.name();
		System.out.println("객체의 이름은 : " + name);
		
		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println("열거순서는 : " + ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueof() 메소드
		Week weekday = Week.valueOf("MONDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말이네요 푹 쉬고 평일에 만나요.");
		}else {
			System.out.println("평일이네요 8시간이상 주무세요.");
		} // valueof if문 종료
		
		// values() 메소드
		Week[] days = Week.values();
		for(Week a : days) {
			System.out.println(a + " ");
		}

	}

}
