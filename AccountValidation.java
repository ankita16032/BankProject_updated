package validations;

public class AccountValidation {

	public boolean checkAccNo(int accNo) {
		if (accNo < 0) {
			System.out.println("Invalid account no");
			return false;
		} else {
			System.out.println("Valid");
			return true;
		}
	}

	public boolean checkBalance(double balance) {
		if (balance <= 0) {
			System.out.println("Balance is invalid");
			return false;
		} else if (balance >= 100000) {
			System.out.println("please show the proof");
			return false;
		} else {
			return true;
		}
	}

	public boolean checkAccHolderName(String accHolderName) {
		boolean valid = false;
		char ch;

		for (int i = 0; i < accHolderName.length(); i++) {
			ch = accHolderName.charAt(i);
			// checking the ascii values
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				valid = true;
			} else {
				valid = false;
				break;
			}
		}
		if (valid == true) {
			System.out.println("valid name");
			return true;
		} else {
			System.out.println("name is invalid");
			return false;
		}
	}

	public boolean checkAll(int accNo, String accHolderName, double balance) {
		if (!checkAccNo(accNo))
			return false;
		else if (!checkAccHolderName(accHolderName))
			return false;
		else if (!checkBalance(balance))
			return false;
		else
			return true;
	}

}
