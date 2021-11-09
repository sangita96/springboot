package com.demoRest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demoRest.dao.AlienRepoI;
import com.demoRest.models.Alien;

@Controller
public class homeController {
		
	@Autowired
	AlienRepoI repo;
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAlien()
	{
		
	return repo.findAll();
		
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAlienById(@PathVariable("aid") int aid)
	{
		
	return repo.findById(aid);
		
	}

}
