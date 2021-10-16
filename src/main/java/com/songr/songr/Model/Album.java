package com.songr.songr.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    private String artist;
    private String title;
    private int length;
    private int  songCount;
    private String imageUrl;

        public Album( ) {
        }


    public Album(String artist, String title, int length, int songCount, String imageUrl) {
    this.artist = artist;
    this.title = title;
    this.length = length;
    this.songCount = songCount;
    this.imageUrl = imageUrl;


    }



    public Long getId() {
       return id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
