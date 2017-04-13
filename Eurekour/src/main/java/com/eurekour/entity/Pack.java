package com.eurekour.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pack {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long idPack;

	    @Column(columnDefinition = "TEXT")
	    private String localisation;

	    @Column(columnDefinition = "TEXT")
	    private String nomPack;

	    @Column(columnDefinition = "TEXT")
	    private String description;
	    
	    private Long nbrTickets;
	    @OneToMany(mappedBy="pack")
	    private List<Client_Pack> client_Packs;
	    @OneToMany(mappedBy="pack")
	    private List<Reservation>reservations;
	    @OneToMany(mappedBy="pack")
	    private List<Type_Etude>typeEtudes;
	    @OneToMany(mappedBy="pack")
	    private List<Matiere> matieres;
	    
	    
		public Pack() {
			super();
		}


		public Pack(String localisation, String nomPack, String description, Long nbrTickets,
				List<Client_Pack> client_Packs, List<Reservation> reservations, List<Type_Etude> typeEtudes,
				List<Matiere> matieres) {
			super();
			this.localisation = localisation;
			this.nomPack = nomPack;
			this.description = description;
			this.nbrTickets = nbrTickets;
			this.client_Packs = client_Packs;
			this.reservations = reservations;
			this.typeEtudes = typeEtudes;
			this.matieres = matieres;
		}


		public Long getIdPack() {
			return idPack;
		}


		public void setIdPack(Long idPack) {
			this.idPack = idPack;
		}


		public String getLocalisation() {
			return localisation;
		}


		public void setLocalisation(String localisation) {
			this.localisation = localisation;
		}


		public String getNomPack() {
			return nomPack;
		}


		public void setNomPack(String nomPack) {
			this.nomPack = nomPack;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Long getNbrTickets() {
			return nbrTickets;
		}


		public void setNbrTickets(Long nbrTickets) {
			this.nbrTickets = nbrTickets;
		}


		public List<Client_Pack> getClient_Packs() {
			return client_Packs;
		}


		public void setClient_Packs(List<Client_Pack> client_Packs) {
			this.client_Packs = client_Packs;
		}


		public List<Reservation> getReservations() {
			return reservations;
		}


		public void setReservations(List<Reservation> reservations) {
			this.reservations = reservations;
		}


		public List<Type_Etude> getTypeEtudes() {
			return typeEtudes;
		}


		public void setTypeEtudes(List<Type_Etude> typeEtudes) {
			this.typeEtudes = typeEtudes;
		}


		public List<Matiere> getMatieres() {
			return matieres;
		}


		public void setMatieres(List<Matiere> matieres) {
			this.matieres = matieres;
		}
	 
	    
	    

}
