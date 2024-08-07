package drive;

import java.util.List;

import dept.DeptDAO;
import dept.DeptDTO;

public class TestMain {

	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		DeptDTO dto1 = new DeptDTO(60, "영업1", "인천");
		dao.insertDept(dto1);
		
		int deptno = dao.searchDeptno("SALES");
		System.out.println(deptno);
		List<DeptDTO> list = dao.listDept();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println("------------------------");
		DeptDTO dto = dao.searchLoc("BOSTON");
		System.out.println(dto);
	}

}
