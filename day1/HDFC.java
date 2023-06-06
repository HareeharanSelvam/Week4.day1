package week3.day1;

public class HDFC implements RBI {

	public boolean submitKYC() {
	System.out.println("Kyc is verified");
		return false;
	}
	
	public void createAccount() {
	 System.out.println("it will take 3 days to create your Account");
	}

	public static void main(String[] args) {
		HDFC account = new HDFC();
		account.createAccount();
		account.submitKYC();
		account.currentAccount(10);
	}
	
	public void currentAccount(int x)
	{
		x=10;
		System.out.println(x);
	}
}
