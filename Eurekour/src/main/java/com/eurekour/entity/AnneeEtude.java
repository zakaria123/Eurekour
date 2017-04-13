package com.eurekour.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AnneeEtude {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnneeEtude;
    @Column(columnDefinition = "TEXT")
    private String nomAnneeEtude;
  
    @ManyToOne
	@JoinColumn(name="id_niveauEtude",referencedColumnName="idNiveauEtude")
    private NiveauEtude niveauEtude;
    
    @OneToMany(mappedBy="anneeEtude")
    private List<ClientAnneeType> clientAnneeType;

    
	public AnneeEtude() {
		super();
	}


	public AnneeEtude(String nomAnneeEtude, NiveauEtude niveauEtude, List<ClientAnneeType> clientAnneeType) {
		super();
		this.nomAnneeEtude = nomAnneeEtude;
		this.niveauEtude = niveauEtude;
		this.clientAnneeType = clientAnneeType;
	}


	public Long getIdAnneeEtude() {
		return idAnneeEtude;
	}


	public void setIdAnneeEtude(Long idAnneeEtude) {
		this.idAnneeEtude = idAnneeEtude;
	}


	public String getNomAnneeEtude() {
		return nomAnneeEtude;
	}


	public void setNomAnneeEtude(String nomAnneeEtude) {
		this.nomAnneeEtude = nomAnneeEtude;
	}


	public NiveauEtude getNiveauEtude() {
		return niveauEtude;
	}


	public void setNiveauEtude(NiveauEtude niveauEtude) {
		this.niveauEtude = niveauEtude;
	}


	public List<ClientAnneeType> getClientAnneeType() {
		return clientAnneeType;
	}


	public void setClientAnneeType(List<ClientAnneeType> clientAnneeType) {
		this.clientAnneeType = clientAnneeType;
	} 
    
    

}
