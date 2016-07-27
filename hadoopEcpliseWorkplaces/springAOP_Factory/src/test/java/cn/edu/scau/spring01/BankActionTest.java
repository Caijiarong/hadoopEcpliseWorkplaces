package cn.edu.scau.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.scau.spring01.mvc.BankAction;

public class BankActionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		BankAction bankAction = context.getBean("bankAction", BankAction.class);
		
		bankAction.transfer();

	}

}
