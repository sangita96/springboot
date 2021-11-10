package com.demorst.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demorst.dao.AlienrepoI;
import com.demorst.models.Alien;

@RestController
public class homeController {
	@Autowired
	AlienrepoI repo;
	
	@PostMapping("/aliens")
	public Alien addAlien(Alien alien)
	{
	    repo.save(alien);
		return alien;
	}
	
	@GetMapping("/aliens")
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	
	@GetMapping("/aliens/{aid}")
	public Optional<Alien> getAliensById(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
	
	@DeleteMapping("/aliens/{aid}")
	public List<Alien> deleteAlien(@PathVariable int aid)
	{
	    repo.deleteById(aid);
		return repo.findAll();
	}

	@PutMapping("/aliens")
	public List<Alien> saveOrUpdateAlien(Alien alien)
	{
		repo.save(alien);;
		return repo.findAll();
	}
}
