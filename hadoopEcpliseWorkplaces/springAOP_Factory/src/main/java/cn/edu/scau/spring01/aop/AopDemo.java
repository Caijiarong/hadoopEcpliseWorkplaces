package cn.edu.scau.spring01.aop;


public class AopDemo {
	
	
	public void before(){
		System.out.println("比如开启事务");
	}
	
	public void after(){
		System.out.println("比如提交事务");
	}

}
