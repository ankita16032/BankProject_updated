package userinterface;

import java.util.Scanner;

import entitiy.Account;
import operations.AccountOperations;
import validations.AccountValidation;

public class TestAccount {

	public static void main(String[] args) {

		Account account1 = new Account();
		Account account2 = new Account();
		AccountOperations accountOperations = new AccountOperations();
		AccountValidation accountvalidation = new AccountValidation();
		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("ICICI Bank");
			System.out.println("1.Accept details");
			System.out.println("2.Display Details");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Deposite Amount");
			System.out.println("5.Transfer Amount");
			System.out.println("6.Check Balance");
			System.out.println("7.Update Balance");
			System.out.println("8.Exit");

			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("---------------------------------------------------");
				System.out.println("Accepting the details..");
				System.out.println("Enter accno, holder name annd balance");
				int accNo = sc.nextInt();
				String accHolderName = sc.next();
				double balance = sc.nextDouble();
				boolean result1 = accountvalidation.checkAll(accNo, accHolderName, balance);
				if (result1 == true) {
					System.out.println("all inputs");
					account1.setAccNo(accNo);
					account1.setAccHolderName(accHolderName);
					account1.setBalance(balance);

				} else {
					System.out.println("Invalid inputs...");
				}

				break;
			case 2:
				System.out.println("---------------------------------------------------");
				System.out.println("Displaying the details");
				System.out.println("account no is: " + account1.getAccNo());
				System.out.println("name is : " + account1.getAccHolderName());
				System.out.println("balance is : " + account1.getBalance());

				break;
			case 3:
				System.out.println("---------------------------------------------------");
				System.out.println("Withdraw Amount");
				System.out.println("Enter amount to withdraw...");
				double amount = sc.nextDouble();
				boolean result = accountOperations.withdraw(account1, amount);
				if (result == true) {
					System.out.println("Withdraw is successfull!!");

					System.out.println("new balance is: " + account1.getBalance());
				} else {
					System.out.println("Withdraw is failed..");
				}
				break;

			case 4:
				System.out.println("---------------------------------------------------");
				System.out.println("Deposite Amount");
				System.out.println("Enter amount to deposite");
				amount = sc.nextDouble();
				result = accountOperations.Deposite(account1, amount);
				if (result == true) {
					System.out.println("Deposite is successful..");
					System.out.println("new balance is: " + account1.getBalance());
				} else {
					System.out.println("Deposite is failed..");
				}
				break;
			case 5:
				System.out.println("---------------------------------------------------");
				System.out.println("Enter accno, holder name annd balance");
				accNo = sc.nextInt();
				accHolderName = sc.next();
				balance = sc.nextDouble();
				result1 = accountvalidation.checkAll(accNo, accHolderName, balance);
				if (result1 == true) {
					System.out.println("all inputs");
					account2.setAccNo(accNo);
					account2.setAccHolderName(accHolderName);
					account2.setBalance(balance);

				} else {
					System.out.println("Invalid inputs...");
				}

				System.out.println("---------------------------------------------------");
				System.out.println("Transfer Amount");
				System.out.println("Enter amount to Transfer");
				amount = sc.nextDouble();
				System.out.println("old balance for " + account1.getAccHolderName() + " is : " + account1.getBalance());
				System.out.println("old balance for " + account2.getAccHolderName() + " is : " + account2.getBalance());

				result = accountOperations.transfer(account1, account2, amount);
				if (result == true) {
					System.out.println("Transfer is successful..");
					System.out.println(
							"new balance for " + account1.getAccHolderName() + " is : " + account1.getBalance());
					System.out.println(
							"new balance for " + account2.getAccHolderName() + " is : " + account2.getBalance());
				} else {
					System.out.println("Transfer is failed..");
				}
				break;
			case 6:
				System.out.println("---------------------------------------------------");
				System.out.println("check Balance");
				System.out.println("Balance is: " + account1.getBalance());

				break;
			case 7:
				System.out.println("---------------------------------------------------");
				System.out.println("Update balance");
				balance = sc.nextDouble();
				account1.setBalance(balance);
				System.out.println("Update balance");
				System.out.println(account1);

				break;
			case 8:
				System.out.println("---------------------------------------------------");
				System.out.println("Thanks For visiting");
				System.exit(0);

			}
			System.out.println("\"Do you want to continue? y/n");
			choice = sc.next();
			} while (choice.equalsIgnoreCase("y"));
			System.out.println("Thanks For visiting");

	}

}
