package schoolrecord.service;

import schoolrecord.DTO.PersonDTO;

public class ReadAllService {

	public static void readAll(PersonDTO[] student) {
		
		System.out.println("======================");
		System.out.println("등록하신 학생 성정목록입니다.");
		for (int i = 0; i < student.length; i++) {
			PersonDTO studentList = student[i];
			if (student[i] != null) {
				System.out.println("이름 : " + studentList.getName());
				System.out.println("국어점수 : " + studentList.getKor());
				System.out.println("수학점수 : " + studentList.getMat());
				System.out.println("영어점수 : " + studentList.getEng());
				int total = student[i].getKor()+student[i].getMat()+student[i].getEng();
				double avg = (student[i].getKor()+student[i].getMat()+student[i].getEng())/3;
				System.out.println("총점 : " + total);
				System.out.println("평균 : " +  avg);
			}
		}
	}

}
