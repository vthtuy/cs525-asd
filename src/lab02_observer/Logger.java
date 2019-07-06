package lab02_observer;

public class Logger implements Observer {

	@Override
	public void observe() {
		log();
	}
	
	private void log() {
		System.out.println("Logger is running ...");
	}

}
