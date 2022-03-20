package com.cesarsolau.pruebaMO.dao;

import java.util.List;

import com.cesarsolau.pruebaMO.entity.Arbol;
import com.cesarsolau.pruebaMO.entity.Nodo;

public interface ArbolDAO {
	
	public List<Integer> crearArbol(int nodos);
	public List<Integer> imprimir(Nodo n, List<Integer> valores);
	public int ancetroMenor(Nodo raiz,int nodo1, int nodo2 );
	public Arbol crearArbolArray(List<Integer> lista);

}
