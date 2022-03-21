package com.cesarsolau.pruebaMO.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cesarsolau.pruebaMO.dao.ArbolDAO;
import com.cesarsolau.pruebaMO.dao.ArbolDAOImpl;

@Service
public class ArbolServiceImpl implements ArbolService{
	
	
	//private ArbolDAO arbolDAO;

	@Override
	public List<Integer> crearArbol(int nodos) {
		ArbolDAO arbolDAO = new ArbolDAOImpl();
		return arbolDAO.crearArbol(nodos);
	}
	
	@Override
	public int crearArbolArray(List<Integer> lista) {
		ArbolDAO arbolDAO = new ArbolDAOImpl();
		int lca =arbolDAO.ancetroMenor(arbolDAO.crearArbolArray(lista).getRaiz(), 24, 40); 
		return lca;
	}
}
