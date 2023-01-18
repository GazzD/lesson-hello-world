package com.ironhack.helloworld.classes;

public class Serie extends Movie {
    private int seasons;

    public Serie(String name, int year, int seasons) {
        super(name, year);
        this.seasons = seasons;
    }

    public void play() {
        System.out.println("Cha chan channn su serie se está reproduciendo");
    }

    public int getSeasons() {
        return seasons;
    }
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}
