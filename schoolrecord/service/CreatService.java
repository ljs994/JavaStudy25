package schoolrecord.service;

import java.util.Scanner;

import schoolrecord.DTO.PersonDTO;

public class CreatService {

	public void creat(Scanner inputInt, Scanner inputStr, PersonDTO[] student) {
		
		System.out.println("등록하실 학생의 정보를 입력 해주시길 바랍니다.");
		PersonDTO myStudentDTO = new PersonDTO();
		
		System.out.print("이름 : ");
		myStudentDTO.setName(inputStr.next());
		System.out.println("국어점수 : ");
		myStudentDTO.setKor(inputInt.nextInt());
		System.out.println("수학점수 : ");
		myStudentDTO.setMat(inputInt.nextInt());
		System.out.println("영어점수 : ");
		myStudentDTO.setEng(inputInt.nextInt());
		
		for (int i = 0; i < student.length ; i++) {
			if (student[i] == null) {
				// i값이 null이면 그 안에 객체를 넣는다.
				student[i] = myStudentDTO;
				break;
			}

		} 
		
		
		
	} // 학생 등록용 서비스

}
