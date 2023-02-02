package com.EcfBack.Oussama.m2i.Vehicules;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class VehiculesController {

    private final VehiculesService vehiculeService;
    public VehiculesController(VehiculesService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    @RequestMapping("")
    public List<Vehicules> findAll() {
        return vehiculeService.findAll();
    }
    @PostMapping("")
    public Vehicules save(@RequestBody Vehicules entity) {
        return vehiculeService.save(entity);
    }
    @GetMapping("{id}")
    public Vehicules findById(@PathVariable String id) {
        return vehiculeService.findById(id);
    }
    @PatchMapping("{id}")
    public Vehicules modifierVehicule(@PathVariable String id,@PathVariable Vehicules utilisateur) {
        return vehiculeService.modifierVehicule(id, utilisateur);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        vehiculeService.deleteById(id);
    }
    @GetMapping("/etat/{etat}")
    public List<Vehicules> findByEtat(@PathVariable String etat) {
        return vehiculeService.findByEtat(etat);
    }
    @GetMapping("/immatriculation/{immatriculation}")
    public List<Vehicules> findByImmatriculation(@PathVariable String immatriculation) {
        return vehiculeService.findByImmatriculation(immatriculation);
    }
    @GetMapping("/marque/{marque}")
    public List<Vehicules> findByMarque(@PathVariable String marque) {
        return vehiculeService.findByMarque(marque);
    }
    @GetMapping("/modele/{modele}")
    public List<Vehicules> findByModele(@PathVariable String modele) {
        return vehiculeService.findByModele(modele);
    }
    @GetMapping("/prix/{prix}")
    public List<Vehicules> findByPrix(@PathVariable Integer prix) {
        return vehiculeService.findByPrix(prix);
    }
    @GetMapping("/statut/{statut}")
    public List<Vehicules> findByStatut(@PathVariable String statut) {
        return vehiculeService.findByStatut(statut);
    }
    @GetMapping("/type/{type}")
    public List<Vehicules> findByType(@PathVariable Type type) {
        return vehiculeService.findByType(type);
    }


}
