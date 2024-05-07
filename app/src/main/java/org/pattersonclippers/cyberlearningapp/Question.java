package org.pattersonclippers.cyberlearningapp;

public class Question {
    private String qText, correctAnswer;

    public Question() {
        qText = "None";
        correctAnswer = "true";
    }
    public Question(String newQText, String newCorrectAnswer) {
        qText = newQText;
        correctAnswer = newCorrectAnswer;
    }

    public String getqText() { return qText; }
    public String getCorrectAnswer() { return correctAnswer; }

    public void setqText(String qText) { this.qText = qText; }
    public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }

    @Override
    public String toString() {
        return "Question: " + qText + "\nAnswer: " + correctAnswer;
    }
}
