
public class Main {
	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer mucahit = new Customer(1,"Muhammet Mucahit","BAYAR");
		
		customerManager.add(mucahit);
	}
}
 