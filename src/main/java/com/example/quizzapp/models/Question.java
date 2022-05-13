package com.example.quizzapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.coyote.Response;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String question;

    @Column(name = "degree")
    private String degree;

    @OneToMany(mappedBy = "question")
    private List<Reponse> reponses;


    @ManyToMany
    @JoinTable(
            name = "seance_questions",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "seance_id"))
    @JsonIgnore
    private Set<Seance> seances;

    @ManyToOne
    private TypeQuestion typeQuestion;
}
