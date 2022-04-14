package com.daga.dagafood.domain.repository;

import java.util.List;

import com.daga.dagafood.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Long id);

}
