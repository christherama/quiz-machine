package co.ramacciotti.answer;

import co.ramacciotti.core.AbstractEntity;
import co.ramacciotti.question.Question;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Answer extends AbstractEntity {
    private String text;

    @ManyToOne
    private Question question;

    protected Answer() {
        super();
    }
}
