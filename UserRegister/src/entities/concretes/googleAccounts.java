package entities.concretes;

public class googleAccounts {
	
	private String googleEmailAdress;
	private long password;
	
	public googleAccounts() {
		
	}
	
	public googleAccounts(String googleEmailAddress, long password) {
		this.googleEmailAdress = googleEmailAddress;
		this.password = password;
	}
	
	public String getGoogleEmailAddress() {
		return googleEmailAdress;
	}
	public void setGoogleEmailAddress(String googleEmailAddress) {
		this.googleEmailAdress = googleEmailAddress;
	}
	public long getPassword() {
		return password;
	}
	public void setPAssword(long password) {
		this.password = password;
	}
	
}
