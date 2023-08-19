package com.example.evaluation;

public class Post {
    private String numQ;
    private String question;
    private float rate;
    private String opinion;

    public Post(String numQ,String question,float rate,String opinion){
        this.numQ = numQ;
        this.question = question;
        this.rate = rate;
        this.opinion = opinion;
    }

    public String getNumQ() {
        return numQ;
    }

    public void setNumQ(String numQ) {
        this.numQ = numQ;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
