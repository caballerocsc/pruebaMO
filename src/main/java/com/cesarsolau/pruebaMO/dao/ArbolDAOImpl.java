package com.cesarsolau.pruebaMO.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.cesarsolau.pruebaMO.entity.Arbol;
import com.cesarsolau.pruebaMO.entity.Nodo;

public class ArbolDAOImpl implements ArbolDAO{
	
	/**
	 * Crear el arbol con la cantidad de nodos que llegen del parametro
	 * @param nodos Cantidad de nodos que tendrá el arbol, el valor de cada nodo se asigna de forma
	 * aleatoria
	 * @return Se retorna una lista de enteros con el valor de cada nodo que se creo en el arbol
	 */
	@Override
	public List<Integer> crearArbol(int nodos){
		Arbol arbol = new Arbol();
		Random r = new Random(System.currentTimeMillis());
        Set<Integer> alreadyUsedNumbers = new HashSet<Integer>();
        while (alreadyUsedNumbers.size()<10) {
           int randomNumber = r.nextInt(100);
           if (!alreadyUsedNumbers.contains(randomNumber) && randomNumber > 0){
              alreadyUsedNumbers.add(randomNumber);
              arbol.insertar(randomNumber);
           }
        }
        return imprimir(arbol.getRaiz(),new ArrayList<Integer>());
	}
	/**
	 * Se encarga de recorrer el arbol y realizar la impresion de los valores 
	 * @param n, nodo actual del arbol
	 * @param valores, lista donde se guarda el valor de cada nodo del arbol
	 * @return lista con los valores de cada uno de los nodos del arbol
	 */
	@Override
	public List<Integer> imprimir(Nodo n, List<Integer> valores) {
        if (n != null) {
            valores.add(n.getDato());
            imprimir(n.getIzquierda(),valores);
            imprimir(n.getDerecha(),valores);
        }
        return valores;
    }
	
	/**
	 * Método que se encarga de buscar el ancestro comun entre dos nodos
	 * @param raiz, nodo principal del arbol
	 * @param nodo1, primer nodo al cual se buscará el ancestro
	 * @param nodo2, segundo nodo al cual se buscara el ancestro comun con nodo1
	 * @return valor del nodo que es ancestro comun de nodo1 y nodo2
	 */
	@Override
	public int ancetroMenor(Nodo raiz,int nodo1, int nodo2 ) {
		int actual = raiz.getDato();
		if(nodo1<=actual && nodo2>=actual)
			return actual;
		else
			if(nodo1>actual && nodo2>actual)
				return ancetroMenor(raiz.getDerecha(),nodo1,nodo2);
			else 
				return ancetroMenor(raiz.getIzquierda(), nodo1, nodo2);
	}
	
	/**
	 * crea un arbol basado en un arreglo de numeros
	 * @param lista de nodos a crear en el arbol
	 * @return clase Arbol con los nodos ya creados
	 */
	@Override
	public Arbol crearArbolArray(List<Integer> lista) {
		Arbol arbol = new Arbol();
		for (Integer i : lista) {
			arbol.insertar(i);
		}
		return arbol;
	}

}
