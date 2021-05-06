package entities.concretes;

import entities.abstracts.Entities;

public class User implements Entities{
	private int id;
	private String name;
	private String lastName;
	private String eMail;
	private String password;
	private Boolean isCheked;
	
	public User(int id, String name, String lastName, String eMail, String password) {
		super();
		this.setId(id);
		this.name = name;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		isCheked = false;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getIsCheked() {
		return isCheked;
	}


	public void setIsCheked(Boolean isCheked) {
		this.isCheked = isCheked;
	}
	
}
