package com.ironhack.helloworld.classes;

public class Movie {

    // public private protected default

    private String name;
    private int year;
    private String director;
    private int duration;
    private double revenue;
    private final int MAX_DURATION = 120;

    public Movie() {
    }

    public Movie(String name, int year) {
        setName(name);
        this.year = year;
    }

    public void play() {
        System.out.println("Cha chan channn su peli se está reproduciendo");
    }

    public void setName(String name) {
        if(name != "Harry Potter") {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration <= MAX_DURATION) {
            this.duration = duration;
        } else {
            System.err.println("No pasarás ! ");
        }
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getMAX_DURATION() {
        return MAX_DURATION;
    }
}
