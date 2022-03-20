package com.cesarsolau.pruebaMO.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.cesarsolau.pruebaMO.entity.Arbol;
import com.cesarsolau.pruebaMO.entity.Nodo;

public class ArbolDAOImpl implements ArbolDAO{
	
	@Override
	public List<Integer> crearArbol(int nodos){
		Arbol arbol = new Arbol();
		Random r = new Random(System.currentTimeMillis());
		for (int i = 0; i < nodos; i++) {
			arbol.insertar(r.nextInt(100));
		}
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
	
	@Override
	public int ancetroMenor(Nodo raiz,int nodo1, int nodo2 ) {
		int actual = raiz.getDato();
		if(nodo1<=actual && nodo2>=actual)
			return actual;
		else
			if(nodo1>actual && nodo2>actual)
				ancetroMenor(raiz.getDerecha(),nodo1,nodo2);
			else 
				ancetroMenor(raiz.getIzquierda(), nodo1, nodo2);
		return 0;
	}
	
	@Override
	public Arbol crearArbolArray(List<Integer> lista) {
		Arbol arbol = new Arbol();
		for (Integer i : lista) {
			arbol.insertar(i);
		}
		return arbol;
	}

}
