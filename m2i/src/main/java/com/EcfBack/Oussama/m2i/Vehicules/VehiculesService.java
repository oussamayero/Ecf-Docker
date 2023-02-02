package com.EcfBack.Oussama.m2i.Vehicules;

import java.util.List;

public interface VehiculesService {
    Vehicules modifierVehicule(String id, Vehicules entity);

    List<Vehicules> findAll();

    Vehicules save(Vehicules entity);

    Vehicules findById(String id);

    void deleteById(String id);

    List<Vehicules> findByEtat(String etat);

    List<Vehicules> findByImmatriculation(String immatriculation);

    List<Vehicules> findByMarque(String marque);

    List<Vehicules> findByModele(String modele);

    List<Vehicules> findByPrix(Integer prix);

    List<Vehicules> findByStatut(String statut);

    List<Vehicules> findByType(Type type);
}
