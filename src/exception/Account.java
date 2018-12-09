package exception;

public class Account {
	double balance;
	double deficit;
	public Account() {
		// TODO 自动生成的构造函数存根
	}
	public Account(double balance) {
		// TODO 自动生成的构造函数存根
		this.balance = balance;
		deficit = 0;
	}
	/**
	 * 取钱
	 * @param amt
	 * @return
	 */
	public double withdraw(double amt) throws OverdraftExcetpion {
		double reAmt ;
		reAmt = balance - amt;
		if(reAmt < 0)
			throw new OverdraftExcetpion("该账户不能透支");
		return reAmt;
	}
	/**
	 * 存钱
	 * @param amt
	 * @return
	 */
	public double deposit(double amt) {
		return balance + amt;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getDeficit() {
		return deficit;
	}
	
	public static void main(String[] args) {
		
	}
	
}
