package mbcboard2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard2.dto.Member2DTO;

public class Member2DAO {
	// 필드
	public Member2DTO member2dto = new Member2DTO();
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	public int result = 0;

	// 기본 생성자
	public Member2DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "myboardtest",
					"myboardtest");

		} catch (ClassNotFoundException e) {
			System.out.println("에러발생 드라이버 이름이나, ojdbc6.jar 파일이 잘못되었습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch (SQLException e) {
			System.out.println("URL, ID, PW가 잘못되었습니다. BoardDAO에 기본 생성자를 확인하세요.");
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

	// resultSet, preparedStatement, statement가 열려있으면 닫는 메서드
	public void closeResources() {
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
		} catch (SQLException e) {
			System.out.println("closeResources() 메서드를 확인하세요");
			e.printStackTrace();
		}
	}

	public void createMember(Member2DTO member2dto) {
		// 회원가입용 메서드

		try {
			String sql = "insert into member (mno, mname, id, pw, email, regidate)"
					+ "values(member_seq.nextval, ?, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, member2dto.getMname());
			preparedStatement.setString(2, member2dto.getId());
			preparedStatement.setString(3, member2dto.getPw());
			preparedStatement.setString(4, member2dto.getEmail());

			System.out.println("쿼리 확인 : " + sql);

			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println(result + "개의 회원이 등록되었습니다.");
				connection.commit();
			} else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			System.out.println("오류 발생 createMember() 메서드의 쿼리문을 다시 확인 해주세요.");
			e.printStackTrace();
		} finally {
			closeResources();
		}

	}

	public void selectAll() {

		try {
			String sql = "select mno, mname, id, email, regidate from member order by mno desc";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			System.out.println("번호\t 이름\t ID\t Email\t 생성일");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("mno") + "\t");
				System.out.print(resultSet.getString("mname") + "\t");
				System.out.print(resultSet.getString("id") + "\t");
				System.out.print(resultSet.getString("email") + "\t");
				System.out.println(resultSet.getDate("regidate") + "\t");
			}
			System.out.println("============= 더 이상 회원이 없습니다. =============");

		} catch (SQLException e) {
			System.out.println("selectAll() 메서드의 쿼리문에서 에러발생");
			e.printStackTrace();
		} finally {
			closeResources();
		}

	}

	public void selectOne(Scanner inputStr) {
		// 한명의 회원을 조회하여 데이터를 제공 받음
		System.out.println("보고싶은 회원의 이름을 입력하세요.");
		System.out.print("이름 : ");
		String name = inputStr.next();

		try {
			String sql = "select mno, mname, id, pw, email, regidate from member where mname = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				Member2DTO member2dto = new Member2DTO();

				member2dto.setMno(resultSet.getInt("mno"));
				member2dto.setMname(resultSet.getString("mname"));
				member2dto.setId(resultSet.getString("id"));
				member2dto.setPw(resultSet.getString("pw"));
				member2dto.setEmail(resultSet.getString("email"));
				member2dto.setRegidate(resultSet.getDate("regidate"));

				System.out.println("번호 : " + member2dto.getMno());
				System.out.println("이름 : " + member2dto.getMname());
				System.out.println("ID : " + member2dto.getId());
				System.out.println("PW : " + member2dto.getPw());
				System.out.println("Email : " + member2dto.getEmail());
				System.out.println("계정 생성일 : " + member2dto.getRegidate());
			} else {
				System.out.println("해당 회원은 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			System.out.println("에러발행 selectOne() 메서드를 확인 해보세요");
			e.printStackTrace();
		} finally {
			closeResources();
		}

	}

	public void update(Scanner inputStr) {
		// 회원 이름을 통해서 정보를 수정하는 메서드
		Member2DTO member2dto = new Member2DTO();
		boolean run = false;

		System.out.println("수정 하고 싶은 회원의 이름을 입력하세요.");
		System.out.print("이름 : ");
		String name = inputStr.next();

		try {
			String sql = "select mno, mname, id, pw, email, regidate from member where mname = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				member2dto.setMno(resultSet.getInt("mno"));
				member2dto.setMname(resultSet.getString("mname"));
				member2dto.setId(resultSet.getString("id"));
				member2dto.setPw(resultSet.getString("pw"));
				member2dto.setEmail(resultSet.getString("email"));
				member2dto.setRegidate(resultSet.getDate("regidate"));

				System.out.println("번호 : " + member2dto.getMno());
				System.out.println("이름 : " + member2dto.getMname());
				System.out.println("ID : " + member2dto.getId());
				System.out.println("PW : " + member2dto.getPw());
				System.out.println("Email : " + member2dto.getEmail());
				System.out.println("계정 생성일 : " + member2dto.getRegidate());
			} else {
				System.out.println("해당 회원은 존재하지 않습니다.");
			}

		} catch (SQLException e) {
			System.out.println("에러발생 update() 메서드를 확인해주세요.");
		} finally {
			closeResources();
		}
		System.out.println("============= 수정을 진행하겠습니다. =============");
		System.out.print("수정할 ID : ");
		member2dto.setId(inputStr.next());

		System.out.print("수정할 PW : ");
		member2dto.setPw(inputStr.next());

		try {
			String sql = "update member set id = ?, pw = ?, regidate = sysdate where mname = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, member2dto.getId());
			preparedStatement.setString(2, member2dto.getPw());
			preparedStatement.setString(3, member2dto.getMname());

			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
				connection.commit();
			} else {
				System.out.println("수정에 실패하였습니다.");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("에러발생 update() 메서드 업데이트 문을 확인해주세요.");
			e.printStackTrace();
		} finally {
			closeResources();
		}
	}

	public void delete(Scanner inputStr) {
		// 회원 탈퇴용 메서드
		
		System.out.println("삭제 하고 싶은 회원의 아이디를 입력하세요.");
		System.out.print("ID :");
		String did = inputStr.next();
		
		try {
			String sql = "delete from  member where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, did);
			
			result = preparedStatement.executeUpdate();
			
			if(result > 0) {
				System.out.println("회원이 삭제되었습니다.");
				connection.commit();
			}else {
				System.out.println("정상적으로 진행되지 않았습니다.");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("에러발생 delete() 메서드를 확인하세요.");
		}finally {
			closeResources();
		}
		
	}

	public Member2DTO login(String id, String pw) {
		try {
			String sql = "SELECT * FROM member WHERE id = ? AND pw = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pw);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				Member2DTO member2dto = new Member2DTO();
				member2dto.setMno(resultSet.getInt("mno"));
				member2dto.setMname(resultSet.getString("mname"));
				member2dto.setId(resultSet.getString("id"));
				member2dto.setPw(resultSet.getString("pw"));
				member2dto.setEmail(resultSet.getString("email"));
				member2dto.setRegidate(resultSet.getDate("regidate"));
				return member2dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
		return null;
	}


}// class종료
