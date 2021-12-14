package junittesting;

public class Transaction {

	public boolean doTransaction(String toAccount, String fromAccount, String balance) throws NumberFormatException{
		
			int toAccountNo = Integer.parseInt(toAccount);
			int fromAccountNo = Integer.parseInt(fromAccount);
			
			final int accountNo = 12345;
			
			if(toAccountNo == accountNo) {
				int bal = Integer.parseInt(balance);
				if(bal > 0) {
					//
					return true;
				}
			}
		
		return false;
	}

	public boolean doTransactionCredit(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return false;
	}
}
