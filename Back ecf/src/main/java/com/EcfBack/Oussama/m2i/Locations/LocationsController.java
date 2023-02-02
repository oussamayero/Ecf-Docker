package com.EcfBack.Oussama.m2i.Locations;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

public class LocationsController {



    private LocationsServices locationsService;
    public void LocationController(LocationsServices locationService) {
        this.locationsService= locationService;
    }

    public LocationsController(LocationsServices locationService, LocationsServices locationsService) {
        this.locationsService = locationsService;

    }

    @GetMapping("")
    public List<Locations> findAll() {
        return locationsService.findAll();
    }
    @PostMapping("")
    public Locations save(@RequestBody Locations entity) {
        return locationsService.save(entity);
    }
    @GetMapping("{id}")
    public Locations findById(@PathVariable String id) {
        return locationsService.findById(id);
    }
    @PatchMapping("{id}")
    public Locations modifierById(String id, Locations entity) {
        LocationsController locationService;
        return locationsService.modifierById(id, entity);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locationsService.deleteById(id);
    }
    @GetMapping("/dateDebut/{dateDebut}")
    public List<Locations> findByDateDebut(@PathVariable LocalDate dateDebut) {
        return locationsService.findByDateDebut(dateDebut);
    }
    @GetMapping("/dateFin/{dateFin}")
    public List<Locations> findByTel(@PathVariable LocalDate dateFin) {
        return locationsService.findByDateFin(dateFin);
    }








}
