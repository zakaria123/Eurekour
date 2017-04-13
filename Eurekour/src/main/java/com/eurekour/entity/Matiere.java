package com.eurekour.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Matiere {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long idMatiere;

	    @Column(columnDefinition = "TEXT")
	    private String nomMatiere;
	    @ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(name = "Professeur_Matiere", joinColumns = { @JoinColumn(name = "idMatiere") },
		inverseJoinColumns = { @JoinColumn })
		 private List<Professeur>professeurs;
	    @ManyToOne
		@JoinColumn(name="id_pack",referencedColumnName="idPack")
	    private Pack pack;
	    @OneToMany(mappedBy="matiere")
	    private List<Seance> seances;
	    
		public Matiere() {
			super();
		}

		public Matiere(String nomMatiere, List<Professeur> professeurs, Pack pack, List<Seance> seances) {
			super();
			this.nomMatiere = nomMatiere;
			this.professeurs = professeurs;
			this.pack = pack;
			this.seances = seances;
		}

		public Long getIdMatiere() {
			return idMatiere;
		}

		public void setIdMatiere(Long idMatiere) {
			this.idMatiere = idMatiere;
		}

		public String getNomMatiere() {
			return nomMatiere;
		}

		public void setNomMatiere(String nomMatiere) {
			this.nomMatiere = nomMatiere;
		}

		public List<Professeur> getProfesseurs() {
			return professeurs;
		}

		public void setProfesseurs(List<Professeur> professeurs) {
			this.professeurs = professeurs;
		}

		public Pack getPack() {
			return pack;
		}

		public void setPack(Pack pack) {
			this.pack = pack;
		}

		public List<Seance> getSeances() {
			return seances;
		}

		public void setSeances(List<Seance> seances) {
			this.seances = seances;
		}
	    
	    
}
