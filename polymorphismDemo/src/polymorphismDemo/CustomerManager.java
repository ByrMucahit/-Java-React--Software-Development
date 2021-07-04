package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger Logger) {
		this.logger = logger;
	}
	
	public void Add() {
		System.out.println("Customer is added");
		this.logger.Log("Log messages");
	}
}
