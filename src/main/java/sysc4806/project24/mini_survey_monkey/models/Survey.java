package sysc4806.project24.mini_survey_monkey.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int surveyId;

    @OneToOne
    private Surveyor owner;

    @OneToMany
    private List<Question> questions;

    private State state;

    public Survey() {}
}
