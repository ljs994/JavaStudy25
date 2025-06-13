package mbcboard2.dto;

import java.util.Date;

public class Board2DTO {
    private int bno;          // 게시글 번호
    private String email;     // 작성자 이메일 (외래키)
    private String title;     // 게시글 제목
    private String content;   // 게시글 내용
    private Date writedate;   // 작성일

    public Board2DTO() {}

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getWritedate() {
        return writedate;
    }

    public void setWritedate(Date writedate) {
        this.writedate = writedate;
    }
}
