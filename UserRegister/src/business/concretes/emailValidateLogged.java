package business.concretes;
import business.abstracts.LoggedServices;

public class emailValidateLogged implements LoggedServices{

	@Override
	public void baseLogged(String messages) {
		// TODO Auto-generated method stub
		System.out.println("email validation is sended "+ messages);
		
		
	}

	@Override
	public void validateIsDone() {
		// TODO Auto-generated method stub
		System.out.println("Account is validated");
	}

}
