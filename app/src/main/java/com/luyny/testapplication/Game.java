package com.luyny.testapplication;

public class Game {
    private String name;
    private String launchDate;
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Game(String name, String launchDate, String genre) {
        this.name = name;
        this.launchDate = launchDate;
        this.genre = genre;
    }
}
