package com.codegym.ss8_bai2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String singer;
    private String type;
    private String song;

    public Song() {
    }

    public Song(int id, String name, String singer, String type, String song) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.type = type;
        this.song = song;
    }

    public Song(String name, String singer, String type, String song) {
        this.name = name;
        this.singer = singer;
        this.type = type;
        this.song = song;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
