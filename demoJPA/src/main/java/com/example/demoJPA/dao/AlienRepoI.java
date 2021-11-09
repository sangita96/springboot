package com.example.demoJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demoJPA.models.Alien;

public interface AlienRepoI extends CrudRepository<Alien, Integer> {
List<Alien> findBylang(String lang);

@Query("from Alien where lang=?1 order by aname")
List<Alien> findBylangSortedByName(String lang);
}
