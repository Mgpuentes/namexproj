package com.code4life.namex.controller;

import com.code4life.namex.model.Artist;
import com.code4life.namex.service.ArtistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class HomeController {

    private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    ArtistService artistService;

    @GetMapping()
    public String home(Model model) {

        Artist artist = new Artist();
        model.addAttribute(artist);

        return "home";
    }

    @PostMapping
    public String homePost(@ModelAttribute("artist") Artist artist) {

        if (artist != null) {
            Artist returned = artistService.saveArtist(artist);
            LOG.debug("Saved artist {}", returned);
        }

        return "redirect:/artists";
    }

    @GetMapping(value = "/artists")
    public String getArtists(Model model) {

        List<Artist> artists = artistService.getAllArtists();
        model.addAttribute("artists", artists);

        return "home";
    }
}
