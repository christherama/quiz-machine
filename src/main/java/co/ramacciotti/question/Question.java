package co.ramacciotti.question;

import co.ramacciotti.answer.Answer;
import co.ramacciotti.core.AbstractEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Question extends AbstractEntity {
    private String text;

    public abstract boolean isCorrect(Answer answer);

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
