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
        Album Album1 = new Album("Sara", "Happiness", 1000, 1000, "lllllll");
        Album Album2 = new Album("Sara", "Happiness", 1000, 1000, "lllllll");
        Album Album3 = new Album("Sara", "Happiness", 1000, 1000, "lllllll");


       list.add(Album1);
       list.add(Album2);
       list.add(Album3);
    model.addAttribute("list", list);

        return "albums";
    }

}

