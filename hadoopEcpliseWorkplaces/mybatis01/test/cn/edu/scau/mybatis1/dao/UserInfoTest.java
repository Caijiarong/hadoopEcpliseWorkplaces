package cn.edu.scau.mybatis1.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.edu.scau.mybatis1.entity.UserInfo;

public class UserInfoTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void before(){
		
		InputStream inputStream;
		try {
			String resource = "mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Test
	public void testSelect() throws IOException{
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			UserInfo userInfo = session.selectOne("test.findById", 12);
			
			System.out.println( userInfo );
		} finally {
			session.close();
		}
		
		
		
	}
	
	@Test
	public void testInsert(){
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			UserInfo userInfo = new UserInfo();
			userInfo.setUserName("张三");
			userInfo.setAge(22);
			userInfo.setPassword("123456");
			
			int i = session.insert("test.insert", userInfo);
			System.out.println("影响行数:" + i);
			//Assert.assertEquals(1, i);
			
			session.commit();
		} catch (Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testDelete(){
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			
			int i = session.delete("test.delete", 8);
			
			System.out.println("影响行数:" + i);
			Assert.assertEquals(1, i);
			
			session.commit();
		} catch (Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testUpdate(){
SqlSession session = sqlSessionFactory.openSession();
		
		try {
			
			UserInfo u = new UserInfo();
			u.setUserid(9);
			u.setUserName("李四");
			u.setAge(88);
			u.setPassword("123456789");
			
			int i = session.update("test.update", u);
			
			System.out.println("影响行数:" + i);
			Assert.assertEquals(1, i);
			
			session.commit();
		} catch (Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
	}
		
}
