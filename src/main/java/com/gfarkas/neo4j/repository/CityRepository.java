package com.gfarkas.neo4j.repository;

import com.gfarkas.neo4j.dao.City;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends Neo4jRepository<City, Long> {
}