package com.gfarkas.neo4j;

import com.gfarkas.neo4j.dao.City;
import com.gfarkas.neo4j.dao.Country;
import com.gfarkas.neo4j.dao.County;
import com.gfarkas.neo4j.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


@SpringBootApplication
public class Main {

    @Autowired
    CountryRepository countryRepository;

    public static void main(String[] args) {

        try {
            SpringApplication.run(Main.class, args);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {

            City budapest = new City();
            budapest.setFounded(new GregorianCalendar(1873, Calendar.NOVEMBER, 17).getTime());
            budapest.setMayor("Gergely Karácsony");
            budapest.setCapitalCity(true);
            budapest.setName("Budapest");
            budapest.setPopulation(1_756_000);
            budapest.setArea(525);

            County pest = new County();
            pest.setName("Pest megye");
            pest.setPopulation(1_226_000);
            pest.setArea(6393);
            pest.setChiefTown(budapest);
            pest.setCities(new ArrayList<>());
            pest.getCities().add(budapest);

            Country magyarOrszag = new Country();
            magyarOrszag.setName("Hungary");
            magyarOrszag.setArea(93030);
            magyarOrszag.setCounties(new ArrayList<>());
            magyarOrszag.getCounties().add(pest);
            magyarOrszag.setLandlocked(true);
            countryRepository.save(magyarOrszag);

        };
    }

}