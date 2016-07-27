package cn.edu.scau.spring01.dao;

import cn.edu.scau.spring01.entity.Account;

public interface BankDao {

	Account findById(String aid);

	boolean update(Account account, double money);

}