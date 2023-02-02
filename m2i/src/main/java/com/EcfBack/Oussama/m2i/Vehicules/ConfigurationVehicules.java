package com.EcfBack.Oussama.m2i.Vehicules;

public class ConfigurationVehicules {

    public VehiculesService vehiculeService(VehiculesRepository vehiculeRepository){
        return (VehiculesService) new VehiculesServiceImplementation(vehiculeRepository);
    }




}
