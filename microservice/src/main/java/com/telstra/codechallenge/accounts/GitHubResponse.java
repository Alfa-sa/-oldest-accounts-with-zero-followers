package com.telstra.codechallenge.accounts;

import java.util.List;

import lombok.Data;

@Data
class GitHubResponse<T> {
    private List<T> items;

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
	
}
