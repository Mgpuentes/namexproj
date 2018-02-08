package com.code4life.namex.service.impl;

import com.code4life.namex.model.Artist;
import com.code4life.namex.repositories.ArtistRepository;
import com.code4life.namex.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    ArtistRepository artistRepository;


    @Override
    public Artist saveArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public void deleteArtist(Long id) {
        artistRepository.delete(id);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
