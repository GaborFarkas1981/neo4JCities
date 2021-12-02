package com.gfarkas.neo4j.service;

import com.gfarkas.neo4j.dao.Country;
import com.gfarkas.neo4j.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Collection<Country> getAll() {
        return countryRepository.findAll();
    }
}