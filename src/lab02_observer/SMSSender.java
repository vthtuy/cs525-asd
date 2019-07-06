package lab02_observer;

public class SMSSender implements Observer {

	@Override
	public void observe() {
		send();
	}
	
	private void send() {
		System.out.println("SMS is sending ...");
	}

}
