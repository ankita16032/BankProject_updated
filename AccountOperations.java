package operations;

import entitiy.Account;

public class AccountOperations {

	public boolean withdraw(Account account, double amount) {
		double bal = account.getBalance();// 30000
		if (bal < amount) {
			System.out.println("Not Enough balance!!!");
			return false;
		} else if (amount < 0) {
			System.out.println("Withdraw amount can nnot be negative..");
			return false;
		} else {
			bal = bal - amount;// 28000
			account.setBalance(bal);
			return true;
		}
	}

	public boolean Deposite(Account account, double amount) {
		double bal = account.getBalance();// 30000

		if (amount < 0) {
			System.out.println("Deposite amount can not be negative..");
			return false;
		} else if (amount > 100000) {
			System.out.println("Show the proof...");
			return false;
		} else {
			bal = bal + amount;// 28000
			account.setBalance(bal);
			return true;
		}
	}

	public boolean transfer(Account account1, Account account2, double amount) {
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();
		if (amount < 0) {
			System.out.println("transfer amount can not be negative");
			return false;
		} else if (bal1 < amount) {
			System.out.println("Not enough balance..");
			return false;
		} else {
			bal1 = bal1 - amount;
			bal2 = bal2 + amount;

			account1.setBalance(bal1);
			account1.setBalance(bal2);
			return true;
		}

	}

}
