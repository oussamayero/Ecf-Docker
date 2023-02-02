package com.EcfBack.Oussama.m2i.Utilisateur;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Utilisateur {



    @Id
    private String id;

    protected LocalDateTime dateCreation = LocalDateTime.now();
    protected LocalDateTime dateModification = LocalDateTime.now();
}
