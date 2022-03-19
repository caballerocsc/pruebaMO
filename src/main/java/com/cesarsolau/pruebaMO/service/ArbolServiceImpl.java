package com.cesarsolau.pruebaMO.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cesarsolau.pruebaMO.dao.ArbolDAO;
import com.cesarsolau.pruebaMO.dao.ArbolDAOImpl;

@Service
public class ArbolServiceImpl implements ArbolService{
	
	
	//private ArbolDAO arbolDAO;

	@Override
	public List<Integer> crearArbol() {
		ArbolDAO arbolDAO = new ArbolDAOImpl();
		return arbolDAO.crearArbol();
	}
	
	

}
