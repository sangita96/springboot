package com.example.demoJPA.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demoJPA.dao.AlienRepoI;
import com.example.demoJPA.models.Alien;


@Controller
public class homeController {
	
	@Autowired
	AlienRepoI repo;
	
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";	
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien ali)
	{
		repo.save(ali);
		return "home.jsp";	
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("getAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findBylang("java"));
		System.out.println(repo.findBylangSortedByName("java"));
		mv.addObject(alien);
		return mv;	
	}

}
