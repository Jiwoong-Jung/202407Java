package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	private static SqlSessionFactory sqlsession_f;
	
	//static 초기화 블럭, 프로그램 실행 시 단 한번만 실행되기 때문에 임의로 실행할 필요가 없어진다.
	static {
		try {
			//config.xml 의 경로 작성
			String resource = "./mybatis/config/config.xml";
			//해당 경로에 있는 config.xml을 객체로 읽어온다.
			Reader reader = Resources.getResourceAsReader(resource);
			//전달한 config.xml 객체를 토대로 Factory를 빌드한다.
			sqlsession_f = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			throw new RuntimeException("초기화 문제 발생");
		}
	}
	
	public static SqlSessionFactory getSqlMapInstance() {
		return sqlsession_f;
	}
}
