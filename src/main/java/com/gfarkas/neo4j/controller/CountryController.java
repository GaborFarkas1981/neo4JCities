package com.gfarkas.neo4j.controller;

import com.gfarkas.neo4j.dao.Country;
import com.gfarkas.neo4j.repository.CountryRepository;
import com.gfarkas.neo4j.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @Autowired
    CountryRepository countryRepository;

    @GetMapping
    public Collection<Country> getAll() {
        return countryService.getAll();
    }
}
