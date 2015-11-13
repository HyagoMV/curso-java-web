package br.com.tutorial.model.service;

import java.util.List;

import br.com.tutorial.model.CadastroDTO;
import br.com.tutorial.model.dao.AnuncioDAO;
import br.com.tutorial.model.dao.CategoriaDAO;
import br.com.tutorial.model.dao.UfDAO;
import br.com.tutorial.model.entity.Categoria;
import br.com.tutorial.model.entity.UF;

public class CadastroAnuncioService {

	public List<UF> getUfs() {
		UfDAO dao = new UfDAO();
		return dao.getUfs();
	}

	public List<Categoria> getCategorias() {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.getCategorias();
	}

	public void salvarAnuncio(CadastroDTO cadastro) {
		// salva o anuncio
		AnuncioDAO dao = new AnuncioDAO();
		dao.salvarAnuncio(cadastro.getAnuncio());
	}

}
