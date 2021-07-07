package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
	private String name;
	private String lastName;
	private String ePosta;
	private long password = 0;
	private List <String> list = new ArrayList<String>();
	
	public Accounts() {
		
	}
	public Accounts(String name, String lastName, String ePosta, long password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public  String getEPosta() {
		return ePosta;
	}
	public void setEPosta(String ePosta) {
		this.ePosta = ePosta;
		
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(String ePosta) {
		this.list.add(ePosta);
	}
}
