package business.abstracts;

import entities.concretes.Accounts;

public interface EmailCheckService {
	public boolean validate(String emailStr);
	public String EmailRepeaterCheck(Accounts account, String email);
}
