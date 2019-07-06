package lab02_observer;

public class EmailSender implements Observer {

	@Override
	public void observe() {
		send();		
	}
	
	private void send() {
		System.out.println("Email is sending ...");
	}

}
