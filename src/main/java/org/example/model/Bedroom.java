package org.example.model;

public class Bedroom {
    private String name,wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Carpet carpet;

    public Bedroom(String name, String wall1, String wall4, String wall3, String wall2, Ceiling ceiling, Bed bed, Carpet carpet) {
        this.name = name;
        this.wall1 = wall1;
        this.wall4 = wall4;
        this.wall3 = wall3;
        this.wall2 = wall2;
        this.ceiling = ceiling;
        this.bed = bed;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public String getWall1() {
        return wall1;
    }

    public String getWall2() {
        return wall2;
    }

    public String getWall3() {
        return wall3;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public String getWall4() {
        return wall4;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
