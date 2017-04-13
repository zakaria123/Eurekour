package com.eurekour.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eurekour.entity.Client;

import com.eurekour.manager.interfaces.IManagerClient;
import com.eurekour.respository.RepositoryUser;

@Service
public class MangerClient implements IManagerClient {
	@Autowired
	private RepositoryUser repositoryUser;

	@Override
	public Client addClient(Client clt) {
		
		return repositoryUser.save(clt);
	}

	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return repositoryUser.findAll();
	}

}
