package com.EcfBack.Oussama.m2i.Locataires;


import com.EcfBack.Oussama.m2i.Utilisateur.Utilisateur;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data


public class Locataire extends Utilisateur {

    private String prenom,nom;

    @JsonFormat(pattern = "jj/mm/YYYY")
    private String dateDeNaissance;

    public String getNom(String nom){return nom;}
    public void setNom(String nom){this.nom = nom;}


    public String getPrenom(String prenom){return prenom;}
    public void setPrenom(String prenom){this.prenom= prenom;}


    public String getDateDeNaissance(String dateDeNaissance){return dateDeNaissance;}
    public void setDateDeNaissance(String dateDeNaissance){this.dateDeNaissance= dateDeNaissance;}


    public String getTel(String telephone){return tel;}
    public void setTel(String tel){this.tel = tel;}



    public String getMail(String mail){return mail;}
    public void setMail(String mail){this.mail = mail;}






    public String mail,tel;



}
