package schoolrecord;

import java.util.Scanner;

import schoolrecord.DTO.AdminDTO;
import schoolrecord.DTO.PersonDTO;
import schoolrecord.service.CreatService;
import schoolrecord.service.DeleteService;
import schoolrecord.service.LoginService;
import schoolrecord.service.ReadAllService;
import schoolrecord.service.ReadOneService;
import schoolrecord.service.UpdateService;

public class SchoolRecordExam {

	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);
	public static PersonDTO[] student = new PersonDTO[5]; // 5명의 학생으로 설정
	

	static AdminDTO adminDTO = new AdminDTO("1234", "1234");

	public static void main(String[] args) {
		boolean run = true;
		

		System.out.println("===== 안녕하세요 MBC성적처리 프로그램입니다. =====");
		System.out.println("*** 이 프로그램은 선생님만 확인 할 수 있는 프로그램입니다. ***");
		System.out.println("확인을 위해 로그인을 해주세요.");

		LoginService loginService = new LoginService();
		LoginService.loginOk(inputStr, adminDTO);
		
		while(run) {
		System.out.println("1.학생성적등록 | 2.전체성적조회 | 3.개인성적조희 | 4. 학생성적수정 | 5. 학생성적삭제 | 6. 프로그램종료");
		System.out.print("메뉴 선택 : ");
		String select = inputStr.next();
		switch(select) {
		case "1" :
			System.out.println("학생성적 등록 메뉴로 이동합니다.");
			CreatService creatService = new CreatService();
			creatService.creat(inputInt, inputStr, student);
			break;
		case "2" :
			System.out.println("전체성적 조회 메뉴로 이동합니다.");
			ReadAllService.readAll(student);
			break;
		case "3" :
			System.out.println("개인성적 조회 메뉴로 이동합니다.");
			ReadOneService.readOne(student, inputStr);
			break;
		case "4" :
			System.out.println("학생성적 수정 메뉴로 이동합니다.");
			UpdateService updateService = new UpdateService();
			UpdateService.update(inputInt, inputStr, student);
			break;
			
		case "5" :
			System.out.println("학생성적 삭제 메뉴로 이동합니다.");
			DeleteService deleteService = new DeleteService();
			DeleteService.delete(inputStr, student);
			break;
		case "6" :
			System.out.println("프로그램을 종료합니다.");
			run = false;
			break;
			
			
		} //switch문 종료
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

}
