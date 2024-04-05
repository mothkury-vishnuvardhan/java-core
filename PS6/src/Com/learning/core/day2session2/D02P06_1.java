package Com.learning.core.day2session2;

public class D02P06_1 {
		
	public static void main(String[] args) throws NegativeAmount {
		try {
			BankAccount acc1=new BankAccount(123, "john", "current", 200);
			acc1.deposit(-100);
			System.out.println(" current balance: "+acc1.getBalance());
			acc1.getBalance();
			//		BankAccount acc2=new BankAccount(123, "john", "savings", -900);
	//	System.out.println("account Created");
		//	acc2.getBalance();
		}
		catch(LowBalanceException | NegativeAmount e) {
			System.out.println(e.getMessage());	
		}}}
