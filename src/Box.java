import java.util.ArrayList;
import java.util.List;

public abstract class Box {
	private List<Observer> observers;
	
	public Box() {
		this.observers = new ArrayList<Observer>();
	}
	
	// Created method attach an observer to observers
	public void attach(Observer observer) {
		System.out.println("Added new observer to the box!!");
		this.observers.add(observer);
	}
	
	// Method to notify all observers
	public void notifier() {
		System.out.println("Notifying all observers...");
		for (Observer observer : this.observers) {
			observer.update();
		}
	}
}

