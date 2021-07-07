package business.concretes;

import business.abstracts.NotificationService;
import business.abstracts.RegisteredUserService;
import entities.concretes.Accounts;

public class RegisteredUserManager implements RegisteredUserService {
	
	

	@Override
	public void authValidate(Accounts account,String eMail, long Password) {
		// TODO Auto-generated method stub
		boolean checkFlag ;
		checkFlag=checkingUtilities(account,eMail, Password);
		System.out.println(checkFlag);
		NotificationService notify = new NotificationManager();
		if(eMail.length() <= 0 || String.valueOf(Password).length() <=0) {
			
			notify.badNews("Both Mail Address and Password must be filled.");
		}
		else if(checkFlag == true){
			notify.goodNews("You have connected succesfully"+eMail);
		}
		else if(checkFlag == false){
			notify.badNews("One of password or email is wrong, Please check it out.");
		}
		
	}

	@Override
	public boolean checkingUtilities(Accounts account,String eMail, long Password) {
		
		for(String mail : account.getList()) {
			System.out.println(mail);
			if(mail == eMail) {
				
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
