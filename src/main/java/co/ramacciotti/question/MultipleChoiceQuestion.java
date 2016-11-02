package co.ramacciotti.question;

import co.ramacciotti.answer.Answer;

import javax.persistence.Entity;

@Entity
public class MultipleChoiceQuestion extends Question {
    @Override
    public boolean isCorrect(Answer answer) {
        return false;
    }
}
