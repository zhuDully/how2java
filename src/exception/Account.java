package exception;

public class Account {
	double balance;
	double deficit;
	public Account() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public Account(double balance) {
		// TODO �Զ����ɵĹ��캯�����
		this.balance = balance;
		deficit = 0;
	}
	/**
	 * ȡǮ
	 * @param amt
	 * @return
	 */
	public double withdraw(double amt) throws OverdraftExcetpion {
		double reAmt ;
		reAmt = balance - amt;
		if(reAmt < 0)
			throw new OverdraftExcetpion("���˻�����͸֧");
		return reAmt;
	}
	/**
	 * ��Ǯ
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
