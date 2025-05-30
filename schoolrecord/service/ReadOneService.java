package schoolrecord.service;

import java.util.Scanner;
import schoolrecord.DTO.PersonDTO;

public class ReadOneService {

	public static void readOne(PersonDTO[] student, Scanner inputStr) {
		System.out.print("조회하고 싶은 학생의 이름을 입력하세요 : ");
		String name = inputStr.next().trim();

		System.out.println("== 디버그용: 현재 등록된 학생들 ==");
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				System.out.println(i + "번 : [" + student[i].getName() + "]");
			}
		}

		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].getName().trim().equals(name)) {
				System.out.println("이름 : " + student[i].getName());
				System.out.println("국어점수 : " + student[i].getKor());
				System.out.println("수학점수 : " + student[i].getMat());
				System.out.println("영어점수 : " + student[i].getEng());

				int total = student[i].getKor() + student[i].getMat() + student[i].getEng();
				double avg = total / 3.0;

				System.out.println("총점 : " + total);
				System.out.println("평균 : " + avg);

				break;

			} else {
				System.out.println("해당 학생은 찾을 수 없습니다.");
			}
		}

	}
}
