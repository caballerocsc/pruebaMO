package com.cesarsolau.pruebaMO.dao;

import java.util.ArrayList;
import java.util.List;

import com.cesarsolau.pruebaMO.entity.Arbol;
import com.cesarsolau.pruebaMO.entity.Nodo;

public class ArbolDAOImpl implements ArbolDAO{
	
	@Override
	public List<Integer> crearArbol(){
		Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        return imprimir(arbol.getRaiz(),new ArrayList<Integer>());
		 
	}
	
	@Override
	public List<Integer> imprimir(Nodo n, List<Integer> valores) {
        if (n != null) {
            valores.add(n.getDato());
            imprimir(n.getIzquierda(),valores);
            imprimir(n.getDerecha(),valores);
        }
        return valores;
    }

}
