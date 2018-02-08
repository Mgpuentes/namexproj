package com.code4life.namex.service;


import com.code4life.namex.model.Artist;

import java.util.List;

public interface ArtistService {

    Artist saveArtist(Artist artist);

    void deleteArtist(Long id);

    List<Artist> getAllArtists();
}
