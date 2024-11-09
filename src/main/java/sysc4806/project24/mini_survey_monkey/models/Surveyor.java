package sysc4806.project24.mini_survey_monkey.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Surveyor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int surveyorId;
}
