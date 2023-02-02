package com.EcfBack.Oussama.m2i.Locataires;

import java.util.List;

public interface LocataireService {
    List<Locataire> findAll();

    Locataire save(Locataire utilisateur);

    Locataire findById(String id);

    void deleteById(String id);

    Locataire modifierLocataire(String id, Locataire utilisateur);

    List<Locataire> findByNom(String nom);

    List<Locataire> findByPrenom(String prenom);

    List<Locataire> findByTel(String tel);

    List<Locataire> findByMail(String mail);

    List<Locataire> findBydateNaissance(String dateNaissance);
}
