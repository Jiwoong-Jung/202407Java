package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class AccountDAO {
	// JDBC 관련 변수 
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String ACC_LIST = "select * from account";
	private String ACC_ONE = "select * from account where id = ?";
	private String ACC_INSERT = "insert into board(writer, title, content, regtime, hits) values(?,?,?,now(),0)";
	private String ACC_COUNT = "SELECT count(*) as cnt FROM account where name = ? and ssn = ?";
	
	//로그인 확인
	public boolean checkLogin(String name, String ssn) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_COUNT);
			stmt.setString(1, name);
			stmt.setString(2, ssn);
			rs = stmt.executeQuery();
			rs.next();
			if (rs.getInt("cnt") == 1) {
				return true;  // 로그인 성공
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return false;   // 로그인 실패
	}
	
	
	//게시판 등록
	public void insertBoard(AccountDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_INSERT);
//			stmt.setString(1, dto.getWriter());
//			stmt.setString(2, dto.getTitle());
//			stmt.setString(3, dto.getContent());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// view.jsp를 위한 게시판 1건 조회
	public AccountDTO getOne(int num) {
		AccountDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_ONE);
			stmt.setInt(1, num);
			rs = stmt.executeQuery();
			if (rs.next()) {
//				dto = new AccountDTO(rs.getInt("num"), rs.getString("writer"),
//						rs.getString("title"), rs.getString("content"),
//						rs.getString("regtime"), rs.getInt("hits"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return dto;
	}
	
	//게시판 목록 조회
	public List<AccountDTO> getBoardList() {
		List<AccountDTO> list = new ArrayList<>();
		
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
//				AccountDTO dto = new AccountDTO(rs.getInt("num"), rs.getString("writer"),
//						rs.getString("title"), rs.getString("content"),
//						rs.getString("regtime"), rs.getInt("hits"));
//				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		
		return list;
	}
}







