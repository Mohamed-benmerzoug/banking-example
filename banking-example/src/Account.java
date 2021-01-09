

public   class  Account {


	public  String custumerID;



	private double balance;



	public Account(String id, double initial) {

		this.custumerID=id;
		this.balance=initial;
	}



	public double getBalance() {

		return this.balance;
	}



	public void display() {
		System.out.println("Account: "+custumerID+ " Balance ="+balance);
		System.out.println("LIMIT ="+DAILY_LIMIT);
	}



	public void deposit(double amount) {

		balance+=amount;

	}

	public boolean withdraw(double amount) {

		if (balance>=amount+DAILY_LIMIT ) {
			balance-=amount;
			return true;
		}
		return false;
	}
	
	//account limit
	final static int DAILY_LIMIT = -1000;
}
