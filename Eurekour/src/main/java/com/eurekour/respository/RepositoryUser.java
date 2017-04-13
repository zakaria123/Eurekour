package com.eurekour.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eurekour.entity.Client;
import com.eurekour.entity.User;

public interface RepositoryUser extends JpaRepository<Client,Long> {

}
