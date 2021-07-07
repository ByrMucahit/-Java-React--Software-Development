import entities.concretes.Accounts;
import business.concretes.AccountsManager;
import GoogleAuthentiication.concretes.googleManager;
import business.abstracts.AccountService;
import business.abstracts.RegisteredUserService;
import business.concretes.RegisteredUserManager;


public class Main {
	public static void main(String[] args) {
		googleManager auth = new googleManager();
		Accounts account = new Accounts();
		AccountService accountManager = new AccountsManager();
		account.setName("Muhammet ");
		account.setLastName("Bayar");
		account.setEPosta("m.mucahitbayar1@gmail.com");
		account.setPassword(1234567);
		
		accountManager.SignUp(account,auth);
		
		
		account.setName("Muhammet Mücahit2");
		account.setLastName("Bayar");
		account.setEPosta("m.mucahitbayar2@gmail.com");
		account.setPassword(1234567);
		
		accountManager.SignUp(account,auth);
		
		account.setName("Muhammet Mücahit3");
		account.setLastName("Bayar");
		account.setEPosta("m.mucahitbayar3@gmail.com");
		account.setPassword(1234567);
	
		
		accountManager.SignUp(account,auth);
		
		for(String a : account.getList()) {
			System.out.println(a);
		}
		
		RegisteredUserService registeredUser = new RegisteredUserManager();
		registeredUser.authValidate(account,"m.mucahitbayar3@gmail.com", 123123);
		
	}
}
