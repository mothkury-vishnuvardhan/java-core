package Com.learning.core.day2session2;

public class BankAccount {
	 
    private int accno;
    private String customerName;
    private String acctype;
    private float balance;
 
    public BankAccount(int accno, String customerName, String acctype, float balance) throws NegativeAmount, LowBalanceException {
        super();
        this.accno = accno;
        this.customerName = customerName;
        this.acctype = acctype;
        this.balance = balance;
 
        if (balance < 0) {
            throw new NegativeAmount("NegativeAmount");
        }
        if (acctype.equalsIgnoreCase("savings") && balance < 1000) {
            throw new LowBalanceException("low balance");
        } else if (acctype.equalsIgnoreCase("current") && balance < 5000) {
            throw new LowBalanceException("low balance");
        }
        this.balance = balance;
    }
 
    public void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount("Negative amount");
        }
        if (amt + balance < 0) {
            throw new NegativeAmount("Negative amount");
        }
        balance += amt;
        System.out.println("Deposit successful, current balance is: " + balance);
    }
 
    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && acctype.equalsIgnoreCase("savings")) {
            throw new LowBalanceException("low balance");
        } else if (balance < 5000 && acctype.equalsIgnoreCase("current")) {
            throw new LowBalanceException("low balance");
        }
        return balance;
    }
}