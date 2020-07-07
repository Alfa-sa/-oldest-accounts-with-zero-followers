package com.telstra.codechallenge.accounts;

import lombok.Data;

@Data
public class owner {
	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
}
