package org.pattersonclippers.cyberlearningapp;

public class Question {
    private String qText;
    private boolean correctAnswer;

    public Question() {
        qText = "None";
        correctAnswer = true;
    }
    public Question(String newQText, boolean newCorrectAnswer) {
        qText = newQText;
        correctAnswer = newCorrectAnswer;
    }


    public String getqText() { return qText; }
    public boolean getCorrectAnswer() { return correctAnswer; }
    public void setqText(String qText) { this.qText = qText; }
    public void setCorrectAnswer(boolean correctAnswer) { this.correctAnswer = correctAnswer; }


    @Override
    public String toString() {
        return "Question: " + qText + "\nAnswer: " + correctAnswer;
    }
}
