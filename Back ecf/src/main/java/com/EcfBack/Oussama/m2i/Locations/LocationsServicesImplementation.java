package com.EcfBack.Oussama.m2i.Locations;

import java.time.LocalDate;
import java.util.List;

public class LocationsServicesImplementation implements LocationsServices {
    public LocationsServicesImplementation(LocationsRepository locationsRepository) {
    }

    @Override
    public List<Locations> findAll() {
        return null;
    }

    @Override
    public Locations save(Locations entity) {
        return null;
    }

    @Override
    public Locations findById(String id) {
        return null;
    }

    @Override
    public Locations modifierById(String id, Locations entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public List<Locations> findByDateDebut(LocalDate dateDebut) {
        return null;
    }

    @Override
    public List<Locations> findByDateFin(LocalDate dateFin) {
        return null;
    }
}
