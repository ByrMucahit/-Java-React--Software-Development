package business.abstracts;

import entities.concretes.Accounts;

public interface RegisteredUserService {
	public void authValidate(Accounts account,String eMail, long Password);
	public boolean checkingUtilities(Accounts account,String eMail, long Password);

}
