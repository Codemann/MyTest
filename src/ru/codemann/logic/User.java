package ru.codemann.logic;

public class User {

	private String id;
	private String login;
	private String passHash;
	
	public User(String id, String login, String passHash) {
		this.id = id;
		this.login = login;
		this.passHash = passHash;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassHash() {
		return passHash;
	}
	
	public void setPassHash(String passHash) {
		this.passHash = passHash;
	}
}
