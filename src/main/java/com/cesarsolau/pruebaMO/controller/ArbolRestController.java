package com.cesarsolau.pruebaMO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarsolau.pruebaMO.service.ArbolService;


@RestController
@RequestMapping("/api")
public class ArbolRestController {
	
	@Autowired
	private ArbolService arbolService;
	
	@GetMapping("/arbol")
	public List<Integer> crearArbol(){
		return arbolService.crearArbol();
	}

}
