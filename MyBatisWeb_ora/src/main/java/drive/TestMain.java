package drive;

import java.util.List;

import dept.DeptDAO;
import dept.DeptDTO;

public class TestMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		int deptno = dao.searchDeptno("영업");
		System.out.println(deptno);
		List<DeptDTO> list = dao.listDept();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
	}
}
