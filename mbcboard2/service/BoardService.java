package mbcboard2.service;

import java.util.Scanner;
import mbcboard2.dao.Board2DAO;
import mbcboard2.dto.Board2DTO;
import mbcboard2.dto.Member2DTO;

public class BoardService {

    private Board2DAO board2dao = new Board2DAO();

    public void boardMenu(Scanner inputStr, Scanner inputLine, Scanner inputInt, Member2DTO sessionUser) {
        boolean run = true;

        while (run) {
            System.out.println("===== 게시판 메뉴 =====");
            System.out.println("1. 글쓰기");
            System.out.println("2. 목록보기");
            System.out.println("3. 게시글 검색");
            System.out.println("4. 글수정");
            System.out.println("5. 글삭제");
            System.out.println("6. 뒤로가기");
            System.out.print("메뉴 선택: ");
            String select = inputStr.next();

            switch (select) {
                case "1":
                    System.out.println(sessionUser.getMname() + "님, 글쓰기 메뉴입니다.");
                    writePost(sessionUser, inputLine);
                    break;
                case "2":
                    System.out.println(sessionUser.getMname() + "님, 게시글 목록을 확인합니다.");
                    listPosts();
                    break;
                case "3":
                    System.out.print("검색할 제목을 입력하세요 : ");
                    String title = inputLine.nextLine();
                    searchPosts(title);
                    break;
                case "4":
                    System.out.println(sessionUser.getMname() + "님, 글수정 메뉴입니다.");
                    updatePost(sessionUser, inputLine, inputInt);
                    break;
                case "5":
                    System.out.println(sessionUser.getMname() + "님, 글삭제 메뉴입니다.");
                    deletePost(sessionUser, inputInt);
                    break;
                case "6":
                    run = false;
                    break;
                default:
                    System.out.println("1~6 사이 숫자만 입력해주세요.");
            }
        } // while 종료
        board2dao.goMain();
    }

    private void writePost(Member2DTO sessionUser, Scanner inputLine) {
        System.out.print("제목: ");
        String title = inputLine.nextLine();

        System.out.print("내용: ");
        String content = inputLine.nextLine();

        Board2DTO post = new Board2DTO();
        post.setEmail(sessionUser.getEmail());
        post.setTitle(title);
        post.setContent(content);

        int result = board2dao.writePost(post);

        if (result > 0) {
            System.out.println("작성 성공");
        } else {
            System.out.println("작성 실패");
        }
    }

    private void listPosts() {
        board2dao.listPosts();
    }

    private void searchPosts(String title) {
        board2dao.searchPosts(title);
    }

    private void updatePost(Member2DTO sessionUser, Scanner inputLine, Scanner inputInt) {
        System.out.print("수정할 게시글 번호 입력: ");
        int bno = inputInt.nextInt();
        inputInt.nextLine();  // 개행 문자 제거

        System.out.print("새 제목 입력: ");
        String newTitle = inputLine.nextLine();

        System.out.print("새 내용 입력: ");
        String newContent = inputLine.nextLine();

        Board2DTO post = new Board2DTO();
        post.setBno(bno);
        post.setEmail(sessionUser.getEmail());
        post.setTitle(newTitle);
        post.setContent(newContent);

        int result = board2dao.updatePost(post);

        if (result > 0) {
            System.out.println("수정 성공");
        } else {
            System.out.println("수정 실패 또는 본인 글이 아닙니다.");
        }
    }

    private void deletePost(Member2DTO sessionUser, Scanner inputInt) {
        System.out.print("삭제할 게시글 번호 입력: ");
        int bno = inputInt.nextInt();

        int result = board2dao.deletePost(bno, sessionUser.getEmail());

        if (result > 0) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패 또는 본인 글이 아닙니다.");
        }
    }
}
