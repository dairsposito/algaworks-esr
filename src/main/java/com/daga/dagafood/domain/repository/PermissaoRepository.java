package com.daga.dagafood.domain.repository;

import java.util.List;

import com.daga.dagafood.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao cozinha);
	void remover(Permissao cozinha);

}
