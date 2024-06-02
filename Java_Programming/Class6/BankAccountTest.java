package Class6;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(10000);	// toString() method
		System.out.println(myAccount);	
		myAccount.withdraw(8000);	// toString() method
		System.out.println(myAccount);
		
	}

}
