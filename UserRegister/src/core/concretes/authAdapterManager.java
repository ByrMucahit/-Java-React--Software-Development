package core.concretes;

import core.abstracts.authService;
import GoogleAuthentiication.concretes.googleManager;

public class authAdapterManager implements authService{
	
	
	@Override
	public void authManager(String message) {
		// TODO Auto-generated method stub
		googleManager manager = new googleManager();
		manager.googleAccounts(message);
		
	}

}
