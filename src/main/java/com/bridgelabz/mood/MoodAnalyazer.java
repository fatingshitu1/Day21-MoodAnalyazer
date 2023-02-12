package com.bridgelabz.mood;

public class MoodAnalyazer {
    private String message;

    public MoodAnalyazer(){
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if (message.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}

