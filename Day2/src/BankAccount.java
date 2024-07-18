
public class BankAccount {
	private int accountId,accountBalance;
	private String accountHolderName;
	private static int totalAmountInHand;
	public BankAccount(int accountId, int accountBalance, String accountHolderName) {
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		
		totalAmountInHand=totalAmountInHand+accountBalance;
	}
	public void depositAmount(int amount) {
		System.out.println(this.accountHolderName +"is depositing :"+amount);
		this.accountBalance=this.accountBalance+amount;
		totalAmountInHand=totalAmountInHand+amount;
	}
	public void withdrawAmount(int amount) {
		System.out.println(this.accountHolderName+"is withdrawing :"+amount);
		if(amount>this.accountBalance) {
			System.out.println("You do not have sufficient balance to withdraw");
		}
		else {
			this.accountBalance=this.accountBalance-amount;
			totalAmountInHand=totalAmountInHand-amount;
		}
	}
	public void displayAccountStatus() {
		System.out.println("ID: "+this.accountId+" Name:"+this.accountHolderName+
				" Current Balance :"+this.accountBalance);
	}
	
	public static int getTotalAmountInHand() {
		return totalAmountInHand;
	}
	
		

	
}
