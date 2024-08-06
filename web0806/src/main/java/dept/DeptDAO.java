package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtil;

public class DeptDAO {
	// JDBC 관련 변수 
		private Connection conn = null;
		private PreparedStatement stmt = null;
		private ResultSet rs = null;
		
		private String DEPT_LIST = "select * from dept";
		private String DEPT_INSERT = "insert into dept(deptno, dname, loc) values (?,?,?)";
		
		public List<DeptDTO> getDeptList() {
			List<DeptDTO> list = new ArrayList<>();
			
			conn = JDBCUtil.getConnection();
			try {
				stmt = conn.prepareStatement(DEPT_LIST);
				rs = stmt.executeQuery();
				while (rs.next()) {
					DeptDTO dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
					list.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(rs, stmt, conn);
			}
			
			return list;
		}
		
		public void insertDept(DeptDTO dto) {
			conn = JDBCUtil.getConnection();
			try {
				stmt = conn.prepareStatement(DEPT_INSERT);
				stmt.setInt(1, dto.getDeptno());
				stmt.setString(2, dto.getDname());
				stmt.setString(3, dto.getLoc());
				stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(stmt, conn);
			}
		}
		
}
