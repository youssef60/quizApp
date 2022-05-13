package com.example.quizzapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import com.example.quizzapp.models.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seance {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( nullable = false )
    private Integer score;

    @OneToOne(mappedBy = "seance")
    private User user;


    @ManyToMany
    private List<Question> questions;
}
