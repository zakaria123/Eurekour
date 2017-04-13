package com.eurekour.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Seance {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSeance ;
	 private Time heureSeance;

	    @Temporal(TemporalType.DATE)
	    private Date dateSeance;

	    @Column(columnDefinition = "TEXT")
	    private String statut;
	    @ManyToOne
		@JoinColumn(name="id_matiere",referencedColumnName="idMatiere")
	   private Matiere matiere;
	    
		public Seance() {
			super();
		}

		public Seance(Time heureSeance, Date dateSeance, String statut, Matiere matiere) {
			super();
			this.heureSeance = heureSeance;
			this.dateSeance = dateSeance;
			this.statut = statut;
			this.matiere = matiere;
		}

		public Long getIdSeance() {
			return idSeance;
		}

		public void setIdSeance(Long idSeance) {
			this.idSeance = idSeance;
		}

		public Time getHeureSeance() {
			return heureSeance;
		}

		public void setHeureSeance(Time heureSeance) {
			this.heureSeance = heureSeance;
		}

		public Date getDateSeance() {
			return dateSeance;
		}

		public void setDateSeance(Date dateSeance) {
			this.dateSeance = dateSeance;
		}

		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public Matiere getMatiere() {
			return matiere;
		}

		public void setMatiere(Matiere matiere) {
			this.matiere = matiere;
		}
	    
	    

}
