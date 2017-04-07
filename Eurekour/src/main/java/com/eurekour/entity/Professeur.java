package com.eurekour.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("PROF")
public class Professeur extends User {
	@OneToMany(mappedBy = "profrsseur", cascade = CascadeType.ALL)
	private List<Disponibilite> disponibilites; 
	
	@Column(columnDefinition = "TEXT")
	private String experiance;
	public Professeur(String nomUser, String prenomUser, Date dateNaissance, String ville, String adresse, String email,
			String telephone, String sexe, String login, String password) {
		super(nomUser, prenomUser, dateNaissance, ville, adresse, email, telephone, sexe, login, password);
		// TODO Auto-generated constructor stub
	}
	public List<Disponibilite> getDisponibilites() {
		return disponibilites;
	}
	public void setDisponibilites(List<Disponibilite> disponibilites) {
		this.disponibilites = disponibilites;
	}
	public String getExperiance() {
		return experiance;
	}
	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}

	
	

}
