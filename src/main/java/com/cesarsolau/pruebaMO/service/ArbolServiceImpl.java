package com.cesarsolau.pruebaMO.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cesarsolau.pruebaMO.dao.ArbolDAO;
import com.cesarsolau.pruebaMO.dao.ArbolDAOImpl;
import com.cesarsolau.pruebaMO.model.LCA;

@Service
public class ArbolServiceImpl implements ArbolService{
	
	
	//private ArbolDAO arbolDAO;

	@Override
	public List<Integer> crearArbol(int nodos) {
		ArbolDAO arbolDAO = new ArbolDAOImpl();
		return arbolDAO.crearArbol(nodos);
	}
	
	@Override
	public int encontrarLCA(LCA obj) {
		ArbolDAO arbolDAO = new ArbolDAOImpl();
		int lca =arbolDAO.ancetroMenor(arbolDAO.crearArbolArray(obj.getNodos()).getRaiz(), obj.getNodo1(), obj.getNodo2()); 
		return lca;
	}
}
