package business.concretes;

import GoogleAuthentiication.concretes.googleManager;
import business.abstracts.AccountService;
import business.abstracts.NameAndSurnameCheckService;
import entities.concretes.Accounts;
import business.concretes.CheckIfManager;
import business.abstracts.CheckIfService;
import business.abstracts.EmailCheckService;
import business.abstracts.LoggedServices;;

public class AccountsManager implements AccountService{
	
	
	

	@Override
	public void SignUp(Accounts account, googleManager gAuth) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				CheckIfService checking = new CheckIfManager();
				EmailCheckService emailChecking = new EmailCheckManager();
				NameAndSurnameCheckService gettingNamed = new NameAndSurnameCheckManager();
				NotificationManager notify = new NotificationManager();
				
				String gettingNamedCheckFlag = "valid";
				String flag = "valid";
				String emailFlag = "valid";
				flag = checking.checkBlankField(account);
				emailFlag = emailChecking.EmailRepeaterCheck(account, account.getEPosta());
				gettingNamedCheckFlag = gettingNamed.nameAndSurnameLengthCheck(account);
				if(emailFlag == "valid" && flag =="valid" && gettingNamedCheckFlag=="valid") {
					System.out.println("Your account has been created"+" "+"You're welcome "+account.getName());
					LoggedServices emailLog = new emailValidateLogged();
					emailLog.baseLogged("Well done, account is created");
					emailLog.validateIsDone();
					notify.goodNews("Yeah welcome use!!");
					gAuth.googleAccounts("You're user of google");
				}else {
					
					System.out.println(flag+"\n"+emailFlag+"\n"+gettingNamedCheckFlag);
					notify.badNews(flag);
					notify.badNews(emailFlag);
					notify.badNews(gettingNamedCheckFlag);
				}
	}
}
