package cn.edu.scau.spring01.entity;

public class Account {
	
	
	private String aid;
	private int status;
	private double money;
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", status=" + status + ", money=" + money + "]";
	}
	
	

}
