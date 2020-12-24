package com.panditg.demo.clientservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panditg.demo.clientdao.ClientDao;
import com.panditg.demo.cliententities.Client;

@Service
public class ClientServiceImp implements ClientService{

	
	@Autowired
	private ClientDao clientdao;
	
	@Override
	public List<Client> getClient() {
		// TODO Auto-generated method stub
		return clientdao.findAll();
	}

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		clientdao.save(client);
		return  client;
	}
	
	
	
	public Client fetchClientByEmailIdAndPassword(String emailId,String password) {
		return clientdao.findByEmailIdAndPassword(emailId,password);
	}

	
	

}
