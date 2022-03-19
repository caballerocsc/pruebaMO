package com.cesarsolau.pruebaMO.dao;

import java.util.List;

import com.cesarsolau.pruebaMO.entity.Nodo;

public interface ArbolDAO {
	
	public List<Integer> crearArbol();
	public List<Integer> imprimir(Nodo n, List<Integer> valores);

}
