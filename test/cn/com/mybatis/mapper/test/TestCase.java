package cn.com.mybatis.mapper.test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.com.mybatis.bean.User;
import cn.com.mybatis.mapper.UserMapper;

public class TestCase {
	private SqlSessionFactory ssf = null;
	@Before
	public void init(){
		ssf = new SqlSessionFactoryBuilder().build(TestCase.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
	}
	
	@Test
	public void testSave() throws Exception{
		SqlSession session = ssf.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User(55,"test2",new Date(),"m","gx");
		mapper.save(user);
		session.commit();
		session.close();
	}
}
