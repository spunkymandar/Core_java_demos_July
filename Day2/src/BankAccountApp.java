
public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1=new BankAccount(101, 1000, "Soham");
		BankAccount account2=new BankAccount(102, 1000, "Aaditi");
		BankAccount account3=new BankAccount(103, 200, "Sarvesh");
		
		account1.depositAmount(500);
		account2.withdrawAmount(200);
		account3.withdrawAmount(5000);
		account3.depositAmount(2500);
		
		account1.displayAccountStatus();
		account2.displayAccountStatus();
		account3.displayAccountStatus();
		
		System.out.println("Total Amount in Bank :"+BankAccount.getTotalAmountInHand());
		
	}

}
