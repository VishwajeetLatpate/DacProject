package com.panditg.demo.clientdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panditg.demo.cliententities.Client;
@Repository
public interface ClientDao extends JpaRepository<Client, Long>
{
    public Client findByEmailIdAndPassword(String emailId,String password);

 }
