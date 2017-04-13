package com.eurekour.resController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eurekour.entity.Client;
import com.eurekour.manager.interfaces.IManagerClient;
@RestController("/client")
public class restController {
 
	@Autowired
	private IManagerClient iManagerClient;
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Client> allPersonnes() {
		return iManagerClient.getAllClient();
	}
	
}
