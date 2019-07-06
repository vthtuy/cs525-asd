package lab02_observer;

public class MainTest {

	public static void main(String[] args) {
		
		SMSSender sms = new SMSSender();
		Logger logger = new Logger();
		EmailSender email = new EmailSender();
		
		Account acc = new Account();
		// register observer before changing
		acc.registerObserver(sms);
		acc.registerObserver(logger);

		System.out.println("**** Updating Account ****");
		acc.setChanged(true);
		
		// register observer before creating account
		System.out.println("**** Creating Account ****");
		acc.registerCreateAccountObserver(email);
		acc.createAccount();
	}

}
