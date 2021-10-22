package com.songr.songr.controller;

import com.songr.songr.Model.Album;
import com.songr.songr.Model.Song;
import com.songr.songr.Model.SongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller

public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

///// post in database using this route

    @ResponseBody
    @PostMapping("/v1/albums")
    public Album createNewPost(@RequestBody Album album) {

        Album newPost = albumRepository.save(album);
        return newPost;
    }


///   when hitting this route, you'll view the form and also albums coming from database

    @GetMapping("/albums")
    public String getAlbums(Model model) {
        model.addAttribute("albums", albumRepository.findAll());

        return "albums";

    }

//when clicking submit you'll save albums in database and will be redirected to => /albums

    @PostMapping("/albums")
    public RedirectView createAlbum(@ModelAttribute Album album) {
        albumRepository.save(album);
        return new RedirectView("albums");
    }



    @GetMapping("/songs")
    public String showAllSongs(Model model) {
        model.addAttribute("songs",songRepository.findAll());
        return "song";
    }


    /////////// this method adds a new song in the database in a certain album
    @PostMapping("/songs")
    public RedirectView addSong(SongDTO song) {
        Album newAlbum = albumRepository.findByTitle(song.getAlbum());
        Song newSong = new Song(song.getTitle(), song.getLength(), newAlbum);
        songRepository.save(newSong);
        return new RedirectView("/albums");
    }


/////////// this method gets the album by Id

    @GetMapping("/albums/{id}")
    public String getAlbumById(@PathVariable ("id") int id , Model model){
        model.addAttribute("albums",albumRepository.findById((long) id).get());
       return "albums";
    }




}