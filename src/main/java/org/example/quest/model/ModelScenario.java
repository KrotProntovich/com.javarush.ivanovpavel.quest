package org.example.quest.model;

import java.util.HashMap;

public abstract class ModelScenario {
    private String prolog;
    private HashMap<String, String> questions;
    private HashMap<String, String> positiveAnswers;
    private HashMap<String, String> negativeAnswers;
    private int level;

    public ModelScenario() {
        this.prolog = createProlog();
        this.questions = createQuestions();
        this.positiveAnswers = createPositiveAnswers();
        this.negativeAnswers = createNegativeAnswers();
        this.level = initLevel();
    }

    protected abstract String createProlog();
    protected abstract HashMap<String, String>createQuestions();
    protected abstract HashMap<String, String>createPositiveAnswers();
    protected abstract HashMap<String, String>createNegativeAnswers();
    protected abstract int initLevel();

    public String getProlog() {
        return prolog;
    }

    public HashMap<String, String> getQuestions() {
        return questions;
    }

    public HashMap<String, String> getPositiveAnswers() {
        return positiveAnswers;
    }

    public HashMap<String, String> getNegativeAnswers() {
        return negativeAnswers;
    }

    public int getLevel() {
        return level;
    }
}
