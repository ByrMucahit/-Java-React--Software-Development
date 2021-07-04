package abstractDemo;


public class CustomerManager {
	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		// Tightly dependencies
		//OracleDataBaseManager oracleDatabaseManager = new OracleDataBaseManager();
		//oracleDatabaseManager.getData();
		
		databaseManager.getData();
	}
	
}
