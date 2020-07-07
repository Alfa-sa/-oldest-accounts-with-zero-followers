package com.telstra.codechallenge.accounts;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class AccountsController {

	@Autowired
    private RestTemplate restTemplate; 
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/oldestAccounts/{count}")
	
    public List<JSONObject> repositories(@PathVariable("count") Integer count) {
        ResponseEntity<AccountsRepository> forEntity =
                restTemplate.getForEntity(String.format("https://api.github.com/search/repositories?q=followers:0&sort=joined&order=asc"), AccountsRepository.class);
        Integer counter = 0;
		List<JSONObject> entities  = new ArrayList<JSONObject>();
        for (Accounts n : forEntity.getBody().getItems()) {
        	if(counter < count) {
	            JSONObject entity = new JSONObject();
	            entity.put("id", n.getId());
	            entity.put("login", n.getOwner().getLogin());
	            entity.put("html_url",n.getHtml_url());
	            entities.add(entity);
	            counter++;
        	}
        	else {
        		break;
        	}
        }
        return entities;
    }
	
	
}
