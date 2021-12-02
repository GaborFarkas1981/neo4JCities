package com.gfarkas.neo4j.dao;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class County {

    @Id
    @GeneratedValue
    Long id;

    @Relationship(type = "PART_OF_COUNTY", direction = Relationship.Direction.INCOMING)
    private List<City> cities;

    private String name;
    private Integer population;
    private Integer area;
    private City chiefTown;

    public County() {
    }

    public Long getId() {
        return id;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public City getChiefTown() {
        return chiefTown;
    }

    public void setChiefTown(City chiefTown) {
        this.chiefTown = chiefTown;
    }
}