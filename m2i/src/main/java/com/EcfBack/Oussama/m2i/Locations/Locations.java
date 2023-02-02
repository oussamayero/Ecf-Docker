package com.EcfBack.Oussama.m2i.Locations;

import com.EcfBack.Oussama.m2i.Locataires.Locataire;
import com.EcfBack.Oussama.m2i.Utilisateur.Utilisateur;
import com.EcfBack.Oussama.m2i.Vehicules.Vehicules;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Locations extends Utilisateur {

    @JsonFormat(pattern = "JJ/MM/YYYY")
    private LocalDate dateDebut;

    @JsonFormat(pattern = "JJ/MM/YYYY")
    private LocalDate dateFin;



    private Long prixTotal;


    private Locataire locataire;


    private Vehicules vehicules;

    public LocalDate getDateDebut() {
        return dateDebut;
    }


    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }



    public Long getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Long prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }

    public Vehicules getVehicule() {
        return vehicules;
    }

    public void setVehicule(Vehicules vehicule) {
        this.vehicules = vehicules;
    }














}
