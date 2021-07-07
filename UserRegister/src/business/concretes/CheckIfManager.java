package business.concretes;

import business.abstracts.CheckIfService;
import entities.concretes.Accounts;
import business.abstracts.EmailCheckService;;

public class CheckIfManager implements CheckIfService{
	
	private boolean emailFlag;
	@Override
	public String checkBlankField(Accounts account) {
		
		String passwordFlag;
		
		EmailCheckService emailCheck = new EmailCheckManager();
		emailFlag = emailCheck.validate(account.getEPosta());
		
		
		passwordFlag = checkPasswordLength(account.getPassword());
		
		// TODO Auto-generated method stub
		if(account.getEPosta().length() <= 0 || account.getLastName().length() <= 0 || account.getName().length() <=0 || account.getPassword() == 0) {
			return "blanked";
		}else if(passwordFlag == "invalid"){

			return "invalidPassword";
		}else if(emailFlag == false) {
			return "Not a mail format";
		}
		else {
			return "valid";
		}
		
	}
	@Override
	public String checkPasswordLength(long password) {
		// TODO Auto-generated method stub
		String message= "valid" ;
		if(String.valueOf(password).length() < 6) {
			message = "invalid";
			return message;
		}
		return message;
		
	}

}
