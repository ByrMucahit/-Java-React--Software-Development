package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("LOgged to database : "+message);
	}
}
