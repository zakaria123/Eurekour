package com.eurekour.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class ProfAnneeType {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProfAnneeType;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ProfAnneeType_Professeur", joinColumns = { @JoinColumn(name = "idProfAnneeType") },
	inverseJoinColumns = { @JoinColumn })
	 private List<Professeur>professeurs;
	 @ManyToOne
	  @JoinColumn(name="id_type_etude",referencedColumnName="idTypeEtude")
	 private Type_Etude typeEtude;
	 @ManyToOne
	  @JoinColumn(name="id_annee_etude",referencedColumnName="idAnneeEtude")
	 private AnneeEtude anneeEtude;
	 
	 
	 
	public ProfAnneeType() {
		super();
	}
	public ProfAnneeType(List<Professeur> professeurs, Type_Etude typeEtude, AnneeEtude anneeEtude) {
		super();
		this.professeurs = professeurs;
		this.typeEtude = typeEtude;
		this.anneeEtude = anneeEtude;
	}
	public Long getIdProfAnneeType() {
		return idProfAnneeType;
	}
	public void setIdProfAnneeType(Long idProfAnneeType) {
		this.idProfAnneeType = idProfAnneeType;
	}
	public List<Professeur> getProfesseurs() {
		return professeurs;
	}
	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}
	public Type_Etude getTypeEtude() {
		return typeEtude;
	}
	public void setTypeEtude(Type_Etude typeEtude) {
		this.typeEtude = typeEtude;
	}
	public AnneeEtude getAnneeEtude() {
		return anneeEtude;
	}
	public void setAnneeEtude(AnneeEtude anneeEtude) {
		this.anneeEtude = anneeEtude;
	}
	 
	 
}
