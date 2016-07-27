package cn.edu.scau.spring01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.edu.scau.spring01.dao.BankDao;
import cn.edu.scau.spring01.entity.Account;


@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDao bankDao;
	
	
	/* (non-Javadoc)
	 * @see cn.edu.scau.spring01.service.BankService#transfer(java.lang.String, java.lang.String, double)
	 */
	public boolean transfer(String a, String b, double money){
		//查询两个帐户的信息
		Account accountA = bankDao.findById(a);
		Account accountB = bankDao.findById(b);
		if(true){
			///
		}
		System.out.println("BankServiceImpl-->transfer");
		bankDao.update(accountA, -money);
		bankDao.update(accountB, money);
		return true;
	}


}
