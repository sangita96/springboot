package com.demorst.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demorst.dao.AlienrepoI;
import com.demorst.models.Alien;

@Controller
public class homeController {
	@Autowired
	AlienrepoI repo;
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAliensById(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
	

}
