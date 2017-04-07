/**
 * This file was generated by the Jeddict
 */
package com.eurekour.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author hamza
 */
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation;

    @Basic
    private String dateSystemReservation;

    @Basic
    private String statut;

    @OneToOne(targetEntity = Seance.class)
    private Seance seance;

    @ManyToOne(targetEntity = Professeur.class)
    private Professeur professeur;

    public Long getIdReservation() {
        return this.idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public String getDateSystemReservation() {
        return this.dateSystemReservation;
    }

    public void setDateSystemReservation(String dateSystemReservation) {
        this.dateSystemReservation = dateSystemReservation;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Seance getSeance() {
        return this.seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Professeur getProfesseur() {
        return this.professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

}