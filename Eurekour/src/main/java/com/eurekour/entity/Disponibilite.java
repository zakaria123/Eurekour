package com.eurekour.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Where;

@Entity
public class Disponibilite {
	@Id
	@GeneratedValue
	private Integer idDesponibite;
	@ManyToOne

	private Professeur profrsseur;
	@OneToMany(mappedBy="disponibilite")
	private List<Jour> jours;
	
	
	public Disponibilite() {
		super();
	}

	public Disponibilite(Professeur profrsseur, List<Jour> jours) {
		super();
		this.profrsseur = profrsseur;
		this.jours = jours;
	}

	public Integer getIdDesponibite() {
		return idDesponibite;
	}

	public void setIdDesponibite(Integer idDesponibite) {
		this.idDesponibite = idDesponibite;
	}

	public Professeur getProfrsseur() {
		return profrsseur;
	}

	public void setProfrsseur(Professeur profrsseur) {
		this.profrsseur = profrsseur;
	}

}
