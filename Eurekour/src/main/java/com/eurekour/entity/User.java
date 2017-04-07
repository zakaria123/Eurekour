package com.eurekour.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="USER_TYPE")
public abstract class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer	idUser;
	@Column(columnDefinition = "TEXT")
   private String nomUser;
   @Column(columnDefinition = "TEXT")
   private String prenomUser;
    @Column(columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
   private Date dateNaissance;
    @Column(columnDefinition = "TEXT")
   private String ville;
    @Column(columnDefinition = "TEXT")
   private String adresse;
    @Column(columnDefinition = "TEXT")
   private String email;
    @Column(columnDefinition = "TEXT")
   private String telephone;
    @Column(columnDefinition = "TEXT")
   private String sexe ;
    @Column(columnDefinition = "TEXT")
   private String login;
    @Column(columnDefinition = "TEXT")
   private String password;
public User(String nomUser, String prenomUser, Date dateNaissance, String ville, String adresse, String email,
		String telephone, String sexe, String login, String password) {
	super();
	this.nomUser = nomUser;
	this.prenomUser = prenomUser;
	this.dateNaissance = dateNaissance;
	this.ville = ville;
	this.adresse = adresse;
	this.email = email;
	this.telephone = telephone;
	this.sexe = sexe;
	this.login = login;
	this.password = password;
}
public Integer getIdUser() {
	return idUser;
}
public void setIdUser(Integer idUser) {
	this.idUser = idUser;
}
public String getNomUser() {
	return nomUser;
}
public void setNomUser(String nomUser) {
	this.nomUser = nomUser;
}
public String getPrenomUser() {
	return prenomUser;
}
public void setPrenomUser(String prenomUser) {
	this.prenomUser = prenomUser;
}
public Date getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
   
}
