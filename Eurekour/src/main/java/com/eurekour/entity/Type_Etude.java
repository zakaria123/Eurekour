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
public class Type_Etude {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long idTypeEtude;

	    @Column(columnDefinition = "TEXT")
	    private String nomTypeEtude;
	    @OneToMany(mappedBy="typeEtude")
	    private List<ClientAnneeType> clientAnneeType; 
	                
	 @ManyToOne
		@JoinColumn(name="id_pack",referencedColumnName="idPack")
	private Pack pack;
	 //niveauEtude
	 @ManyToOne
		@JoinColumn(name="id_NiveauEtude",referencedColumnName="idNiveauEtude")
    private NiveauEtude niveauEtude;
	 
	 
	 
	 
	public Type_Etude() {
		super();
	}
	
	public Type_Etude(String nomTypeEtude, List<ClientAnneeType> clientAnneeType, Pack pack, NiveauEtude niveauEtude) {
		super();
		this.nomTypeEtude = nomTypeEtude;
		this.clientAnneeType = clientAnneeType;
		this.pack = pack;
		this.niveauEtude = niveauEtude;
	}

	public Long getIdTypeEtude() {
		return idTypeEtude;
	}
	public void setIdTypeEtude(Long idTypeEtude) {
		this.idTypeEtude = idTypeEtude;
	}
	public String getNomTypeEtude() {
		return nomTypeEtude;
	}
	public void setNomTypeEtude(String nomTypeEtude) {
		this.nomTypeEtude = nomTypeEtude;
	}
	public List<ClientAnneeType> getClientAnneeType() {
		return clientAnneeType;
	}
	public void setClientAnneeType(List<ClientAnneeType> clientAnneeType) {
		this.clientAnneeType = clientAnneeType;
	}
	public Pack getPack() {
		return pack;
	}
	public void setPack(Pack pack) {
		this.pack = pack;
	}
	public NiveauEtude getNiveauEtude() {
		return niveauEtude;
	}
	public void setNiveauEtude(NiveauEtude niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	 
	 
}
