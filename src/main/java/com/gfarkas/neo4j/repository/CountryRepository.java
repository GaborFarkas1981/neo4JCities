package com.gfarkas.neo4j.repository;


import com.gfarkas.neo4j.dao.Country;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface CountryRepository extends Neo4jRepository<Country, Long> {
}