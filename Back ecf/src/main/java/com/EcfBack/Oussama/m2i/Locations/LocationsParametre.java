package com.EcfBack.Oussama.m2i.Locations;

public class LocationsParametre {

    public LocationsServices locationsServices(LocationsRepository locationsRepository){
        return (LocationsServices) new LocationsServicesImplementation(locationsRepository);
    }
}
