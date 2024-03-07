package org.pattersonclippers.cybersecuremeapp;

public class Facts {
    private String fact;
    private int picture;

    public Facts() {
        fact = "People lost $10 billion to scams\nin 2023, according to the FTC.";
        picture = R.drawable.fact1pic;
    }

    public Facts(String newFact, int newPicture) {
        fact = newFact;
        picture = newPicture;
    }

    public String getFact() { return fact; }

    public int getPicture() { return picture; }


    public void setFact(String fact) { this.fact = fact; }

    public void setPicture(int picture) { this.picture = picture; }

    @Override
    public String toString() {
        return "Fact right now: " + fact + "\nPicture right now: " + picture;
    }
}
