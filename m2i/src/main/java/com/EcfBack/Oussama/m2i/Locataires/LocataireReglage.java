package com.EcfBack.Oussama.m2i.Locataires;

import org.springframework.context.annotation.Bean;

public class LocataireReglage {

    @Bean
    public LocataireService locataireService(LocataireRepository locataireRepository){
        return (LocataireService) new LocataireServiceImplementation(locataireRepository);
    }
}
