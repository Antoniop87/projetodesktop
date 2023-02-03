package br.com.projetopoo.controller;

import java.sql.Connection;
import java.util.List;

import br.com.projetopoo.dao.CategoriaDAO;
import br.com.projetopoo.factory.ConnectionFactory;
import br.com.projetopoo.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;
	
	public CategoriaController(){
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}
	
	public List<Categoria> listar(){
		return this.categoriaDAO.listar();
	}
	
}
