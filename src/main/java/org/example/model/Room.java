package org.example.model;

public class Room {
    private String name;
    private String wall1, wall2, wall3, wall4;

    public Room(String wall2, String name, String wall1, String wall3, String wall4) {
        this.wall2 = wall2;
        this.name = name;
        this.wall1 = wall1;
        this.wall3 = wall3;
        this.wall4 = wall4;
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

    public String getWall4() {
        return wall4;
    }
}
