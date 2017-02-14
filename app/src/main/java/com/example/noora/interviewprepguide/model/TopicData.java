package com.example.noora.interviewprepguide.model;

/**
 * Created by noora on 2/13/2017.
 */

public class TopicData {

    private String question, answer;

    public TopicData(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}