package com.eurekour.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CLT")
public class Client extends User{
@Column(columnDefinition = "TEXT")
  private String ecole;

public Client(String nomUser, String prenomUser, Date dateNaissance, String ville, String adresse, String email,
		String telephone, String sexe, String login, String password, String ecole) {
	super(nomUser, prenomUser, dateNaissance, ville, adresse, email, telephone, sexe, login, password);
	this.ecole = ecole;
}
  
}
