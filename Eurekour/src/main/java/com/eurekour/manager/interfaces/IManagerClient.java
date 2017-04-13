package com.eurekour.manager.interfaces;

import java.util.List;

import com.eurekour.entity.Client;

public interface IManagerClient {
  public Client addClient(Client clt);
  public List<Client> getAllClient();
}
