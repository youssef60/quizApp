package com.example.quizzapp.models;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String password;

    @OneToOne()
    private Seance seance;


}
