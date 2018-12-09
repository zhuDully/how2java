package exception;

public class CheckingAccount extends Account {
	double overdraftProtection;
	
	

	public CheckingAccount() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}
	
	
	
	public double getOverdraftProtection() {
		return overdraftProtection;
	}

	public double withdraw(double amt) throws OverdraftExcetpion {
		double reAmt ;
		reAmt = balance - amt;
		System.out.println("取款后的余额：" + reAmt);
		double ed = reAmt + getOverdraftProtection();
		System.out.println("取款后的可透支的额度：" + ed);
		if(ed < 0)
			throw new OverdraftExcetpion("该账户不能透支超过" + getOverdraftProtection());
		return reAmt;
		
	}
	
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(100, 500);
		try {
			ca.withdraw(600);
		} catch (OverdraftExcetpion e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
