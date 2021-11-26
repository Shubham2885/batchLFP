package batchlft86.batchlft86;


/**
 * @author Shubham
 * to achieve data hiding: using abstraction
 * introduce => access modifier => public, private, protected, default
 * default access modifier => default => (Variables)it could be in the current package
 */
public class Accounting {

	//instance variable
	private int accountNo;
	public double balance;
	private String username;
	private String password;
	
	public Accounting() {
		accountNo = 1111111;
	}
	
	//instance method
	//defination of method
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
//	@Override
//	public String toString() {
//		return "Accounting [accountNo=" + accountNo + ", balance=" + balance + ", username=" + username + ", password="
//				+ password + "]";
//	}
	
	public int getAccountNo() {
		return this.accountNo;
	}
}
