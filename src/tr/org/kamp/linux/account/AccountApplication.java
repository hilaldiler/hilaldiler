package tr.org.kamp.linux.account;

import javax.sound.midi.Soundbank;


public class AccountApplication {
	public static void main(String[] args) {
		Account myAccount = new Account("Ian Curtis", 500);
		Account myAccount1 = new Account("Yavuz Cetin", 300);
		Account myAccount2 = new Account("Jim Morrison");

		myAccount2.deposit(300);
		System.out.println(myAccount2.getBalance());
		myAccount.setName("Kerim Capli");
		System.out.println(myAccount.getName());
		System.out.println(myAccount1.getName());

	}
}

