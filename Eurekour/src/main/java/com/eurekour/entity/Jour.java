package com.eurekour.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Long idJour;
	@ManyToOne
	private Disponibilite disponibilite;
	
	public Jour() {
		super();
	}
	public Jour(Disponibilite disponibilite) {
		super();
		this.disponibilite = disponibilite;
	}
	public Long getIdJour() {
		return idJour;
	}
	public void setIdJour(Long idJour) {
		this.idJour = idJour;
	}
	public Disponibilite getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(Disponibilite disponibilite) {
		this.disponibilite = disponibilite;
	}

	
}
