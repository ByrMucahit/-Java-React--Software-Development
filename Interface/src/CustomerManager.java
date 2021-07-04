
public class CustomerManager  {
	
	private Logger [] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Customer is added"+ customer.getFirstName());
		
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName()+" Database is logged");
		//this.logger.log(customer.getFirstName());
		
		//for(Logger logger: loggers) {
			//logger.log(customer.getFirstName());
		//}
		
		//Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());	
	}
	public void delete(Customer customer) {
		System.out.println("Customer is deleted "+ customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName()+ " Database is logged");
		//this.logger.log(customer.getFirstName());

		//for(Logger logger: loggers) {
			//logger.log(customer.getFirstName());
		//}
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
