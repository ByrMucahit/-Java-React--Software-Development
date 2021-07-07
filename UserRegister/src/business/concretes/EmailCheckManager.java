package business.concretes;
import java.util.regex.Pattern;
import entities.concretes.Accounts;
import business.abstracts.EmailCheckService;


public class EmailCheckManager implements EmailCheckService{
public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
	@Override
	public boolean validate(String emailStr) {
		// TODO Auto-generated method stub
		java.util.regex.Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
	
	@Override
	public String EmailRepeaterCheck(Accounts account, String email) {
		// TODO Auto-generated method stub
		String emailFlag= "valid";
		if(account.getList().isEmpty()){
			System.out.println("It is empty");
			account.setList(email);
			emailFlag = "valid";
			return emailFlag;
		}
		else {
			
		for(String repeatEmail: account.getList()) {
			if(repeatEmail == email) {
				emailFlag = "repeatedEmail";
				System.out.println(emailFlag);
				return emailFlag;
			}
		}
		account.setList(email);
		return emailFlag;
		}
	}
}
