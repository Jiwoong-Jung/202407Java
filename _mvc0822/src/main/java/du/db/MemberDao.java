package du.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class MemberDao {

	// SqlSessionFactory를 SqlMapConfig를 통하여 생성한다.
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public MemberDao() {
		// SqlSessionFactory에서 session을 할당받는다.
		// 이 때 openSession에 true를 주어야 자동 커밋이 된다.
		// default는 false이다.
		session = sqlsession_f.openSession(true);
	}
	
	public int isMember(MemberDto memberDto) {
		MemberMapper mm = session.getMapper(MemberMapper.class);
		return mm.isMember(memberDto);
	}
	
	public MemberDto findMember(MemberDto memberDto) {
		MemberMapper mm = session.getMapper(MemberMapper.class);
		return mm.findMember(memberDto);
	}
	
}
