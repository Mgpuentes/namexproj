package com.code4life.namex.repositories;

import com.code4life.namex.model.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {

    List<Artist> findAll();
}
