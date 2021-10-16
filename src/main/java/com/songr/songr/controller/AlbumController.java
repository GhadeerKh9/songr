package com.songr.songr.controller;

import com.songr.songr.Model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller

public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

///// post in database using this route

    @ResponseBody
    @PostMapping("/v1/albums")
    public Album createNewPost(@RequestBody Album album) {

        Album newPost = albumRepository.save(album);
        return newPost;
    }


///   when hitting this route, you'll view the form and also albums coming from database

    @GetMapping("/albums")
    public String getAlbums(Model model){
        model.addAttribute("albums", albumRepository.findAll());

        return "albums";

    }

//when clicking submit you'll save albums in database and will be redirected to => albums,,aka same html page

    @PostMapping("/albums")
    public RedirectView createAlbum(@ModelAttribute Album album) {
        albumRepository.save(album);
        return new RedirectView("albums");
    }
//



}
