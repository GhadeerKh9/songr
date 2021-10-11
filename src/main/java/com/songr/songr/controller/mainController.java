package com.songr.songr.controller;


import com.songr.songr.Model.Album;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


@Controller
public class mainController {

    @GetMapping("/hello")
    public String greeting() {

        return "hello";
    }


    @GetMapping("/Capitalize/{word}")
    public String capitalization(@PathVariable String word, Model model ){
        word.toUpperCase();
        model.addAttribute("wordHTML", word.toUpperCase());
        return "capitalization";

    }






    @GetMapping("/album")
    public String getClassInformation(Model model) {
        List<Album> list = new ArrayList<>();
        Album Album1 = new Album("Jadal", "La Tloo' Al-Daww", 1000, 1000, "https://i.ytimg.com/vi/4ADGYRJ4kIQ/maxresdefault.jpg");
        Album Album2 = new Album("Julia Boutross", "Yawman ma", 1000, 1000, "https://i1.sndcdn.com/artworks-000025826032-rfb25v-t500x500.jpg");
        Album Album3 = new Album("Rami Esam", "Segni-Bil-Alwan", 1000, 1000, "https://lyricstranslate.com/files/styles/large/public/12523840_1030903076953677_6196382277839151779_n.jpg?itok=vOQZhaJf");


       list.add(Album1);
       list.add(Album2);
       list.add(Album3);
       model.addAttribute("list", list);

        return "albums";
    }
}

