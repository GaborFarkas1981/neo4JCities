package com.gfarkas.neo4j.dao;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Date;

@Node
public class City {
    @Id
    @GeneratedValue
    Long id;
    private String name;
    private Integer population;
    private Boolean capitalCity;
    private Integer area;
    private Date founded;
    private String mayor;

    public City() {
    }

    public Long getId() {
        return id;
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

    public Boolean getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(Boolean capitalCity) {
        this.capitalCity = capitalCity;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getFounded() {
        return founded;
    }

    public void setFounded(Date founded) {
        this.founded = founded;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }
}