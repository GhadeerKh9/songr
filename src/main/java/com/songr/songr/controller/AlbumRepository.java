package com.songr.songr.controller;

import com.songr.songr.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlbumRepository extends JpaRepository <Album, Long>{



    Album findByTitle(String title);


    Optional<Album> findById(String id);

}
