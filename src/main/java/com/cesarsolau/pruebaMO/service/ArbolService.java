package com.cesarsolau.pruebaMO.service;

import java.util.List;

import com.cesarsolau.pruebaMO.model.LCA;

public interface ArbolService {
	
	public List<Integer> crearArbol(int nodos);
	public int encontrarLCA(LCA obj);
	

}
