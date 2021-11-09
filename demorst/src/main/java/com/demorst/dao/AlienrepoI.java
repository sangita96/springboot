package com.demorst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demorst.models.Alien;

public interface AlienrepoI extends JpaRepository<Alien, Integer> { 

}
