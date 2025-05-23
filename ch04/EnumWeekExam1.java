package ch04;

public class EnumWeekExam1 {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		System.out.println(today == Week.SUNDAY);
		
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println(week1 == week2);

	}

}
