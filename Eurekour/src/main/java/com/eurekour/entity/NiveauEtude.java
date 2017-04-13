package com.eurekour.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NiveauEtude {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long idNiveauEtude;

	    @Column(columnDefinition = "TEXT")
	    private String nomNiveauEtude;
	    @OneToMany(mappedBy="niveauEtude")
	    List<Type_Etude>typeetudes;
	    @OneToMany(mappedBy="niveauEtude")  //niveauEtude
	    List<AnneeEtude>anneeEtudes;
	    
	    
		public NiveauEtude() {
			super();
		}


		public NiveauEtude(String nomNiveauEtude, List<Type_Etude> typeetudes, List<AnneeEtude> anneeEtudes) {
			super();
			this.nomNiveauEtude = nomNiveauEtude;
			this.typeetudes = typeetudes;
			this.anneeEtudes = anneeEtudes;
		}


		public Long getIdNiveauEtude() {
			return idNiveauEtude;
		}


		public void setIdNiveauEtude(Long idNiveauEtude) {
			this.idNiveauEtude = idNiveauEtude;
		}


		public String getNomNiveauEtude() {
			return nomNiveauEtude;
		}


		public void setNomNiveauEtude(String nomNiveauEtude) {
			this.nomNiveauEtude = nomNiveauEtude;
		}


		public List<Type_Etude> getTypeetudes() {
			return typeetudes;
		}


		public void setTypeetudes(List<Type_Etude> typeetudes) {
			this.typeetudes = typeetudes;
		}


		public List<AnneeEtude> getAnneeEtudes() {
			return anneeEtudes;
		}


		public void setAnneeEtudes(List<AnneeEtude> anneeEtudes) {
			this.anneeEtudes = anneeEtudes;
		}
	    
		
	    
}
