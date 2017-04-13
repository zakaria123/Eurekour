package com.eurekour.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ClientAnneeType {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long idClientAnneeType;
	 
	 @ManyToOne
	 private Client client;
	 @ManyToOne
	  @JoinColumn(name="id_type_etude",referencedColumnName="idTypeEtude")
	 private Type_Etude typeEtude;
	 @ManyToOne
	  @JoinColumn(name="id_annee_etude",referencedColumnName="idAnneeEtude")
	 private AnneeEtude anneeEtude;
	public ClientAnneeType() {
		super();
	}
	public ClientAnneeType(Client client, Type_Etude typeEtude, AnneeEtude anneeEtude) {
		super();
		this.client = client;
		this.typeEtude = typeEtude;
		this.anneeEtude = anneeEtude;
	}
	public Long getIdClientAnneeType() {
		return idClientAnneeType;
	}
	public void setIdClientAnneeType(Long idClientAnneeType) {
		this.idClientAnneeType = idClientAnneeType;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
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
