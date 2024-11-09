package sysc4806.project24.mini_survey_monkey.models;

import jakarta.persistence.*;

@Entity
public abstract class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;

    private String questionTitle;

    @ManyToOne
    @JoinColumn(name="survey_id")
    private Survey survey;

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }
}
