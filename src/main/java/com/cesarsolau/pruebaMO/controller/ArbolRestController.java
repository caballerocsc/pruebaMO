package com.cesarsolau.pruebaMO.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarsolau.pruebaMO.service.ArbolService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/api")
public class ArbolRestController {
	
	@Autowired
	private ArbolService arbolService;
	
	

	@GetMapping("/arbol/{nodos}")
	public List<Integer> crearArbol(@PathVariable int nodos){
		return arbolService.crearArbol(nodos);
	}

	
	@GetMapping("/arbol/lca")
	public int ancestroComunMenor(){
		List<Integer> l =new ArrayList<>();
		l.add(20);
		l.add(11);
		l.add(24);
		l.add(21);
		l.add(35);
		l.add(32);
		l.add(40);
		return arbolService.crearArbolArray(l);
	}
	
	@PostMapping("/arbol")
	public int createPerson( @RequestBody int nodo1, @RequestBody int nodo2) {
		return 0;
		//return arbolService.crearArbolArray(arbol);
	}
}
