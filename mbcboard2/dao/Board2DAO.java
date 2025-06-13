package mbcboard2.dao;

import java.sql.*;

import mbcboard2.dto.Board2DTO;

public class Board2DAO {
    public Connection connection = null;
    public Statement statement = null;
    public PreparedStatement preparedStatement = null;
    public ResultSet resultSet = null;
    public int result = 0;

    public Board2DAO() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "myboardtest",
                "myboardtest"
            );
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("DB 연결 오류");
            e.printStackTrace();
            System.exit(0);
        }
    }
    
	public void goMain() {
		try {
			if (resultSet != null)
				resultSet.close();
			System.out.println("resultSet.close(); 성공");
			if (preparedStatement != null)
				preparedStatement.close();
			System.out.println("preparedStatement.close(); 성공");
			if (statement != null)
				statement.close();
			System.out.println("statement.close(); 성공");
			if (connection != null)
				connection.close();
			System.out.println("connection.close(); 성공");
		} catch (SQLException e) {
			System.out.println("goMain() 메서드를 확인하세요");
			e.printStackTrace();
		}

	}

    public void closeResources() {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (statement != null) statement.close();
        } catch (SQLException e) {
            System.out.println("closeResources() 오류");
            e.printStackTrace();
        }
    }

    // 게시글 전체 목록 출력
    public void listPosts() {
        try {
            String sql = "SELECT bno, email, title, writedate FROM board ORDER BY bno DESC";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            System.out.println("번호\t작성자\t제목\t작성일");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("bno") + "\t");
                System.out.print(resultSet.getString("email") + "\t");
                System.out.print(resultSet.getString("title") + "\t");
                System.out.println(resultSet.getDate("writedate"));
            }
            System.out.println("========= 게시글 목록 끝 =========");
        } catch (SQLException e) {
            System.out.println("listPosts() 오류");
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }

    // 게시글 작성
    public int writePost(Board2DTO dto) {
        try {
            String sql = "INSERT INTO board (bno, email, title, content, writedate) VALUES (board_seq.nextval, ?, ?, ?, sysdate)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dto.getEmail());
            preparedStatement.setString(2, dto.getTitle());
            preparedStatement.setString(3, dto.getContent());

            result = preparedStatement.executeUpdate();

            if (result > 0) {
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException e) {
            System.out.println("writePost() 오류");
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return result;
    }

    // 게시글 검색 출력 (제목 or 작성자 이메일)
    public void searchPosts(String title) {
        try {
            String sql = "SELECT bno, email, title, writedate FROM board WHERE title = ? ORDER BY bno DESC";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, title);
            resultSet = preparedStatement.executeQuery();

            System.out.println("번호\t작성자\t제목\t작성일");
            boolean found = false;
            while (resultSet.next()) {
                found = true;
                System.out.print(resultSet.getInt("bno") + "\t");
                System.out.print(resultSet.getString("email") + "\t");
                System.out.print(resultSet.getString("title") + "\t");
                System.out.println(resultSet.getDate("writedate"));
            }
            if (!found) {
                System.out.println("검색 결과가 없습니다.");
            }
            System.out.println("========= 검색 결과 끝 =========");
        } catch (SQLException e) {
            System.out.println("searchPosts() 오류");
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }

    // 게시글 수정
    public int updatePost(Board2DTO dto) {
        try {
            String sql = "UPDATE board SET title = ?, content = ? WHERE bno = ? AND email = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dto.getTitle());
            preparedStatement.setString(2, dto.getContent());
            preparedStatement.setInt(3, dto.getBno());
            preparedStatement.setString(4, dto.getEmail());

            result = preparedStatement.executeUpdate();

            if (result > 0) {
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException e) {
            System.out.println("updatePost() 오류");
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return result;
    }

    // 게시글 삭제
    public int deletePost(int bno, String email) {
        try {
            String sql = "DELETE FROM board WHERE bno = ? AND email = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, bno);
            preparedStatement.setString(2, email);

            result = preparedStatement.executeUpdate();

            if (result > 0) {
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException e) {
            System.out.println("deletePost() 오류");
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return result;
    }
}
