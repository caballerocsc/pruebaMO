package com.cesarsolau.pruebaMO.entity;

/**
 * @author cesar
 *Clase que compone la estructura minima de un arbol balanceado, el nodo y que permite conectarse 
 *a otros nodos descendientes por derecha o izquierda
 */
public class Nodo {
	private int dato;
	private Nodo izquierda, derecha;

	public Nodo(int dato) {
		this.dato = dato;
		this.izquierda = this.derecha = null;
	}

	public int getDato() {
		return dato;
	}

	public Nodo getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}

	public Nodo getDerecha() {
		return derecha;
	}

	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}

	public void imprimirDato() {
		System.out.println(this.getDato());
	}

}
