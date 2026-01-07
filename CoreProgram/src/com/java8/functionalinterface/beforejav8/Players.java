package com.java8.functionalinterface.beforejav8;

public class Players {
    private String name;
    private int matchedPlayed;
    private  int runScored;
    private int noOfCentury;

    public Players(String name, int matchedPlayed, int runScored, int noOfCentury) {
        this.name = name;
        this.matchedPlayed = matchedPlayed;
        this.runScored = runScored;
        this.noOfCentury = noOfCentury;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", matchedPlayed=" + matchedPlayed +
                ", runScored=" + runScored +
                ", noOfCentury=" + noOfCentury +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatchedPlayed() {
        return matchedPlayed;
    }

    public void setMatchedPlayed(int matchedPlayed) {
        this.matchedPlayed = matchedPlayed;
    }

    public int getRunScored() {
        return runScored;
    }

    public void setRunScored(int runScored) {
        this.runScored = runScored;
    }

    public int getNoOfCentury() {
        return noOfCentury;
    }

    public void setNoOfCentury(int noOfCentury) {
        this.noOfCentury = noOfCentury;
    }
}
