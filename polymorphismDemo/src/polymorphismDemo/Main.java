package polymorphismDemo;

public class Main {
	public static void main(String[] args) {
		//EmailLogger logger = new EmailLogger();
		//logger.Log("Log message");
	
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
		
		for(BaseLogger logger:loggers) {
			logger.Log("lOg messages");
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
		
		
	}
}
