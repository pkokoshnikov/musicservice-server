package com.pkokoshnikov.database;

public class Song {
    private String name;
    private String text;
    private Integer id;

    public Song(String name, String text, Integer id) {
        this.name = name;
        this.text = text;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public Integer getSongId() {
        return id;
    }
}
