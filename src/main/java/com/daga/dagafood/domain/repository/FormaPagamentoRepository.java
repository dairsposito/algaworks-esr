package com.daga.dagafood.domain.repository;

import java.util.List;

import com.daga.dagafood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {

	List<FormaPagamento> listar();
	FormaPagamento buscar(Long id);
	FormaPagamento salvar(FormaPagamento cozinha);
	void remover(FormaPagamento cozinha);

}
