package com.cesarsolau.pruebaMO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarsolau.pruebaMO.model.LCA;
import com.cesarsolau.pruebaMO.service.ArbolService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;





@RestController
@RequestMapping("/api")
public class ArbolRestController {
	
	@Autowired
	private ArbolService arbolService;
	
	
	@ApiOperation("Crea un arbol con la cantidad de nodos que se le envie en el paramentro {nodos}, "
			+ "el valor de cada nodos es asignado "
			+ "de forma aleatoria")
	@ApiResponses(value = { 
	        @ApiResponse(code = 200, message = "Operación exitosa"),
	        @ApiResponse(code = 400, message = "Error en la operacion") })
	@GetMapping("/arbol/{nodos}")
	public List<Integer> crearArbol(@PathVariable int nodos){
		return arbolService.crearArbol(nodos);
	}

	
	/*@GetMapping("/arbol/lca")
	public int ancestroComunMenor(){
		List<Integer> l =new ArrayList<>();
		l.add(20);
		l.add(11);
		l.add(24);
		l.add(21);
		l.add(35);
		l.add(32);
		l.add(40);
		return arbolService.encontrarLCA(l);
	} */
	
	@ApiOperation("dado un arbol y dos nodos ubicar cual es el ancestro común mas cercano")
	@ApiResponses(value = { 
	        @ApiResponse(code = 200, message = "Operación exitosa"),
	        @ApiResponse(code = 400, message = "Error en la operacion") })
	@PostMapping("/arbol")
	public String ancestroComunMenor( @RequestBody LCA lca) {
		int r = arbolService.encontrarLCA(lca);
		return "El ancentro comun es:"+ r ;
		//return lca;
	}
}
