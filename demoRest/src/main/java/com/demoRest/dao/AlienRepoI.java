package com.demoRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.demoRest.models.Alien;

public interface AlienRepoI extends JpaRepository<Alien, Integer> {

}
