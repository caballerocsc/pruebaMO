package com.cesarsolau.pruebaMO.entity;

/**
 * @author cesar
 * Clase que continen el nodo principal y permite agregar elementos al arbol
 * @version 19/03/2022
 */
/**
 * @author cesar
 *
 */
public class Arbol {

	private Nodo raiz;

	public Arbol() {

	}

	 /**
     * 
     * @param dato valor que contendrá el nodo que sera agregado al arbol
     * el metodo valida que el nodo raiz sea valido, si no existe crea uno nuevo nodo raiz y le asigna el valor
     * de la variable dato. Si ya existe envia la raiz del arbol y el valor.
     * para que se verifique en que parte se debe agregar.
     */
	public void insertar(int dato) {
		if (this.raiz == null) {
			this.raiz = new Nodo(dato);
		} else {
			this.insertar(this.raiz, dato);
		}
	}

	/**
	 * Método que evalua en que posicion del padre de debe agregar el nuevo valor. en caso de que los hijos del
	 * nodo padre ya existan, los recorre de forma recursiva.
	 * @param padre nodo actual que se evaluara para validar si se inserta a la derecha o izquierda
	 * @param dato valor del nodo a insertar
	 */
	private void insertar(Nodo padre, int dato) {
		if (dato > padre.getDato()) {
			if (padre.getDerecha() == null) {
				padre.setDerecha(new Nodo(dato));
			} else {
				this.insertar(padre.getDerecha(), dato);
			}
		} else {
			if (padre.getIzquierda() == null) {
				padre.setIzquierda(new Nodo(dato));
			} else {
				this.insertar(padre.getIzquierda(), dato);
			}
		}
	}

}
