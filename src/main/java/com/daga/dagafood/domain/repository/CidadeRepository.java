package com.daga.dagafood.domain.repository;

import java.util.List;

import com.daga.dagafood.domain.model.Cidade;

public interface CidadeRepository {

	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cozinha);
	void remover(Cidade cozinha);

}
