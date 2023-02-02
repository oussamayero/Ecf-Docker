package com.EcfBack.Oussama.m2i.Locataires;

import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;

import java.util.List;

public interface LocataireRepository {
/**
 * Affiche la liste de tout les locataires ainsi que nom prenom date de naissance et numero de tel

 */
    List<Locataire> findByNom(String Nom);
    List<Locataire> findByPrenom(String prenom);
    List<Locataire> findDateDeNaissance(String DateDeNaissance);
    List<Locataire> findByTel(String tel);

}
