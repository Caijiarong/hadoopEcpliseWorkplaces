package cn.edu.scau.spring01.mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.edu.scau.spring01.service.BankService;

@Controller
public class BankAction {
	
	private int age;
	
	@Autowired
	private BankService bankService;
	
	public String transfer(){
		try{
			String a = "123";
			String b = "234";
			double money = 500d;
			
			System.out.println("BankAction-->transfer,age:" + age);
			
			bankService.transfer(a, b, money);
			
			return "success";
		} catch ( Exception e){
			e.printStackTrace();
		}
		return "error";
		
	}


	
	

}
