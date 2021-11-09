package com.demorst.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demorst.dao.AlienrepoI;

@Controller
public class homeController {
	@Autowired
	AlienrepoI repo;
	

}
