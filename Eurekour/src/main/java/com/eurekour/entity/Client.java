package com.eurekour.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("CLT")
public class Client extends User{
@Column(columnDefinition = "TEXT")
  private String ecole;
@OneToMany(mappedBy="client")
private List<Client_Pack>client_Packs;

@OneToMany(mappedBy="client")
private List<Reservation>reservations;


public Client() {
	super();
}
public Client(String nomUser, String prenomUser, Date dateNaissance, String ville, String adresse, String email,
		String telephone, String sexe, String login, String password, String ecole) {
	super(nomUser, prenomUser, dateNaissance, ville, adresse, email, telephone, sexe, login, password);
	this.ecole = ecole;
}
public String getEcole() {
	return ecole;
}
public void setEcole(String ecole) {
	this.ecole = ecole;
}
public List<Client_Pack> getClient_Packs() {
	return client_Packs;
}
public void setClient_Packs(List<Client_Pack> client_Packs) {
	this.client_Packs = client_Packs;
}

public List<Reservation> getReservations() {
	return reservations;
}
public void setReservations(List<Reservation> reservations) {
	this.reservations = reservations;
}
  
}
