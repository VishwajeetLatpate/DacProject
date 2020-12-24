package com.panditg.demo.clientservice;

import java.util.List;

import com.panditg.demo.cliententities.Client;

public interface ClientService {
	public List<Client> getClient();
	public Client addClient(Client client);
	
	public Client fetchClientByEmailIdAndPassword(String mailId,String password);

}
