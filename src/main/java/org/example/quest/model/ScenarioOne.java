package org.example.quest.model;

import java.util.HashMap;

public class ScenarioOne extends ModelScenario{
    @Override
    protected String createProlog() {
        return "Очнувшись на скамейке в парке, вы осознали что не можете вспомнить что происходило за последнюю неделю.\n"+
                "Темнело и на чистом небе начали постепенно появляться звезды.\n"+
                "Одна звезда была очень яркая. Полярная, подумали вы.\n"+
                "Но свет звезды становился все ярче, и, постепенно она повисла над тобой огромным светлым пятном.\n"+
        "Это было НЛО!\n" +"Полетели с нами ";
    }

    @Override
    protected HashMap<String, String> createQuestions() {
        HashMap<String, String> questions = new HashMap<>();
        questions.put("1", "Принять вызов НЛО?");
        questions.put("2", "Ты принял вызов. Поднимаешься на мостик к капитану?");
        questions.put("3", "Ты поднялся на мостик. Ты кто?");
        return questions;
    }

    @Override
    protected HashMap<String, String> createPositiveAnswers() {
        HashMap<String, String> positiveAnswers = new HashMap<>();
        positiveAnswers.put("1.1", "Принять вызов");
        positiveAnswers.put("2.1", "Подняться на мостик");
        positiveAnswers.put("3.1", "Рассказать правду о себе");
        positiveAnswers.put("4.1", "Тебя вернули домой. Победа");
        return positiveAnswers;
    }

    @Override
    protected HashMap<String, String> createNegativeAnswers() {
        HashMap<String, String> negativeAnswers = new HashMap<>();
        negativeAnswers.put("1.2", "Отклонить вызов");
        negativeAnswers.put("1.2.1", "Ты отклонил вызов. Поражение");
        negativeAnswers.put("2.2", "Отказаться подниматься на мостик");
        negativeAnswers.put("2.2.1", "Ты не пошел на переговоры. Поражение");
        negativeAnswers.put("3.2", "Солгать о себе");
        negativeAnswers.put("3.2.1", "Твою лож разоблачили. Поражение");
        return negativeAnswers;
    }

    @Override
    protected int initLevel() {
        return 4;
    }
}
