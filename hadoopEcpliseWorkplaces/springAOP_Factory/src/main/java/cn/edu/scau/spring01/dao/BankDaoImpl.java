package cn.edu.scau.spring01.dao;


import org.springframework.stereotype.Repository;

import cn.edu.scau.spring01.entity.Account;

@Repository
public class BankDaoImpl implements BankDao {
	
	//private Properties pro;
	
	
	/* (non-Javadoc)
	 * @see cn.edu.scau.spring01.dao.BankDao#findById(java.lang.String)
	 */
	public Account findById(String aid){
		System.out.println("BankDaoImpl-->findById");
		
		//System.out.println("jdbc.driver.className:" + pro.getProperty("jdbc.driver.className"));
		Account account = new Account();
		account.setAid(aid);
		account.setMoney(10000);
		account.setStatus(1);
		
		return account;
		
	}
	
	/* (non-Javadoc)
	 * @see cn.edu.scau.spring01.dao.BankDao#update(cn.edu.scau.spring01.entity.Account, double)
	 */
	public boolean update( Account account , double money){
		System.out.println("BankDaoImpl-->update");
		return true;
	}

	/*public void setPro(Properties pro) {
		this.pro = pro;
	}*/
	
	

}
