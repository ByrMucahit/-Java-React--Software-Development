package business.abstracts;
import entities.concretes.Accounts;

public interface CheckIfService {
	public String checkBlankField(Accounts account);
	public String checkPasswordLength(long password);
}
