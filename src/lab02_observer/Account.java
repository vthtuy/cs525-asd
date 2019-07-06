package lab02_observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {

	private List<Observer> listOfObserver = new ArrayList<>();
	private List<Observer> listCreateAccountObserver = new ArrayList<>();
	
	private boolean changed;
	
	@Override
	public void notifyObservers() {
		for (Observer observer : listOfObserver) {
			observer.observe();
		}		
	}
	
	public void createAccount() {
		for (Observer observer : listCreateAccountObserver) {
			observer.observe();
		}
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
		if (changed) {
			notifyObservers();
		}
	}
	
	public void deposit() {
		this.setChanged(true);
	}

	public void registerObserver(Observer obs) {
		listOfObserver.add(obs);
	}
	public void registerCreateAccountObserver(Observer obs) {
		listCreateAccountObserver.add(obs);
	}
}
