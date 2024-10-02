package entitiy;

public class Account {

	private int accNo;
	private String accHolderName;
	private double balance;

	public Account() {
		accNo = 0;
		accHolderName = null;
		balance = 0.0;
	}

	public Account(int accNo, String accHolderName, double balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}

}
