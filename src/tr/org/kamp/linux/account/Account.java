package tr.org.kamp.linux.account;

public class Account {
	private String name;
	private double Balance;

	public Account(String name, double Balance) {
		this.name = name;
		if (Balance > 0.0) {
			this.Balance = Balance;
		}
	}

	public Account() {

	}

	public Account(String name) {
		this.name = name;

	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			Balance = Balance + depositAmount;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { // global degiskenlere deger yüklemek icin kullanılr//
		this.name = name;
	}

	public double getBalance() { // global degiskenlere yuklenmis olan degerleri almak icin kullanılır//
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

}