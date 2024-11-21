package org.example.model;

public class Bedroom extends Room{
    private Ceiling ceiling;
    private Bed bed;
    private Carpet carpet;

    public Bedroom(String name, String wall1, String wall4, String wall3, String wall2, Ceiling ceiling, Bed bed, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4);
        this.ceiling = ceiling;
        this.bed = bed;
        this.carpet = carpet;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
