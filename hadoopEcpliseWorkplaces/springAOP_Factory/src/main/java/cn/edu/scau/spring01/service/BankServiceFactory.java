package cn.edu.scau.spring01.service;

public class BankServiceFactory {
	
	private static BankService bankService = new BankServiceImpl();
	
	private BankServiceFactory(){}
	
	public static BankService createInstance(){
		return bankService;
	}

}
