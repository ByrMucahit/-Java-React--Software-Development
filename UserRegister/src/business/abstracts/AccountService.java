package business.abstracts;
import GoogleAuthentiication.concretes.googleManager;
import core.abstracts.authService;
import entities.concretes.Accounts;;
public interface AccountService {
	public void SignUp(Accounts account, googleManager gAuth);
}
