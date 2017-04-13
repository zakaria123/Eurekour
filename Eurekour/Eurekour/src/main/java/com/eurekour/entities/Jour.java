/**
 * This file was generated by the Jeddict
 */
package com.eurekour.entities;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author hamza
 */
@Entity
public class Jour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJour;

    @Basic
    private String nomJour;

    @ManyToMany(targetEntity = Creneau.class)
    private List<Creneau> creneaus;

    @ManyToMany(targetEntity = Professeur.class, mappedBy = "jours")
    private List<Professeur> professeurs;

    public Long getIdJour() {
        return this.idJour;
    }

    public void setIdJour(Long idJour) {
        this.idJour = idJour;
    }

    public String getNomJour() {
        return this.nomJour;
    }

    public void setNomJour(String nomJour) {
        this.nomJour = nomJour;
    }

    public List<Creneau> getCreneaus() {
        return this.creneaus;
    }

    public void setCreneaus(List<Creneau> creneaus) {
        this.creneaus = creneaus;
    }

    public List<Professeur> getProfesseurs() {
        return this.professeurs;
    }

    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

}