package schoolrecord.service;

import java.util.Scanner;
import schoolrecord.DTO.PersonDTO;

public class UpdateService {

	public static void update(Scanner inputInt, Scanner inputStr, PersonDTO[] student) {
		System.out.print("수정할 학생의 이름을 입력하세요 : ");
		String name = inputStr.next();


		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].getName().equals(name)) {
				System.out.println("학생을 찾았습니다. 새 점수를 입력해주세요.");
				System.out.print("국어점수 : ");
				student[i].setKor(inputInt.nextInt());
				System.out.print("수학점수 : ");
				student[i].setMat(inputInt.nextInt());
				System.out.print("영어점수 : ");
				student[i].setEng(inputInt.nextInt());

				System.out.println("학생 점수가 성공적으로 수정되었습니다.");
				break;
			}else {
				 System.out.println("해당 학생을 찾을 수 없습니다.");
			}
		}

	}
}
