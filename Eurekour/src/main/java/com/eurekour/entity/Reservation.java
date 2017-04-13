package com.eurekour.entity;

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
public class Reservation {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long idReservation;

	    @Temporal(TemporalType.DATE)
	    private Date dateSystemReservation;

	    @Column(columnDefinition = "TEXT")
	    private String statut;
	    @ManyToOne
	    private Client client;
	    @ManyToOne
		@JoinColumn(name="id_pack",referencedColumnName="idPack")
		private Pack pack;
	    
		public Reservation() {
			super();
		}

		public Reservation(Date dateSystemReservation, String statut, Client client, Pack pack) {
			super();
			this.dateSystemReservation = dateSystemReservation;
			this.statut = statut;
			this.client = client;
			this.pack = pack;
		}

		public Long getIdReservation() {
			return idReservation;
		}

		public void setIdReservation(Long idReservation) {
			this.idReservation = idReservation;
		}

		public Date getDateSystemReservation() {
			return dateSystemReservation;
		}

		public void setDateSystemReservation(Date dateSystemReservation) {
			this.dateSystemReservation = dateSystemReservation;
		}

		public String getStatut() {
			return statut;
		}

		public void setStatut(String statut) {
			this.statut = statut;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public Pack getPack() {
			return pack;
		}

		public void setPack(Pack pack) {
			this.pack = pack;
		}
	    
	    

}
