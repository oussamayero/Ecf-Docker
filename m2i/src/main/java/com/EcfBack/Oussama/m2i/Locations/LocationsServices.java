package com.EcfBack.Oussama.m2i.Locations;

import java.time.LocalDate;
import java.util.List;

public interface LocationsServices {
    List<Locations> findAll();

    Locations save(Locations entity);

    Locations findById(String id);

    Locations modifierById(String id, Locations entity);

    void deleteById(String id);

    List<Locations> findByDateDebut(LocalDate dateDebut);

    List<Locations> findByDateFin(LocalDate dateFin);
}
