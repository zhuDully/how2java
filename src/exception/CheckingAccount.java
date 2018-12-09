package exception;

public class CheckingAccount extends Account {
	double overdraftProtection;
	
	

	public CheckingAccount() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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
		System.out.println("ȡ������" + reAmt);
		double ed = reAmt + getOverdraftProtection();
		System.out.println("ȡ���Ŀ�͸֧�Ķ�ȣ�" + ed);
		if(ed < 0)
			throw new OverdraftExcetpion("���˻�����͸֧����" + getOverdraftProtection());
		return reAmt;
		
	}
	
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(100, 500);
		try {
			ca.withdraw(600);
		} catch (OverdraftExcetpion e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
