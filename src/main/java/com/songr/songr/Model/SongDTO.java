package com.songr.songr.Model;

public class SongDTO {

    private String title;
    private String album;
    private int length;
    private String id;


    public SongDTO(String title, String album, int length, String id) {
        this.title = title;
        this.album = album;
        this.length = length;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
