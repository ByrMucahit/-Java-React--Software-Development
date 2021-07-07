package business.concretes;

import business.abstracts.NameAndSurnameCheckService;
import entities.concretes.Accounts;;

public class NameAndSurnameCheckManager implements NameAndSurnameCheckService {

	@Override
	public String nameAndSurnameLengthCheck(Accounts account) {
		// TODO Auto-generated method stub
		String message = "valid";
		if(account.getName().length()<2 || account.getLastName().length()<2) {
			message = "Invalid named, Both name and surname must be two characters at least";
		}
		return message;
		
	}

}
