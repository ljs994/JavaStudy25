package schoolrecord.service;

import java.util.Scanner;
import schoolrecord.DTO.PersonDTO;

public class DeleteService {

	public static void delete(Scanner inputStr, PersonDTO[] student) {
		System.out.print("삭제할 학생의 이름을 입력하세요 : ");
		String name = inputStr.next();

		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].getName().equals(name)) {
				student[i] = null;
				System.out.println("학생 정보가 삭제되었습니다.");

				break;
			} else {
				System.out.println("해당 학생을 찾을 수 없습니다.");
			}
		}

	}
}
