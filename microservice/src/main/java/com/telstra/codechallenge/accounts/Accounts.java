package com.telstra.codechallenge.accounts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Accounts {
	private String id;
	private owner owner;
    private String html_url;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public owner getOwner() {
		return owner;
	}
	public void setOwner(owner owner) {
		this.owner = owner;
	}
	public String getHtml_url() {
		return html_url;
	}
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}
	    
	    
}
