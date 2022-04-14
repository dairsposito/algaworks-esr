package com.daga.dagafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.daga.dagafood.domain.exception.EntidadeEmUsoException;
import com.daga.dagafood.domain.exception.EntidadeNaoEncontradaException;
import com.daga.dagafood.domain.model.Cidade;
import com.daga.dagafood.domain.model.Estado;
import com.daga.dagafood.domain.repository.CidadeRepository;
import com.daga.dagafood.domain.repository.EstadoRepository;

@Service
public class CadastroCidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	public Cidade salvar(Cidade cidade) {
		Long estadoId = cidade.getEstado().getId();
		Estado estado = estadoRepository.buscar(estadoId);

		if (estado == null) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe cadastro de estado com código %d", estadoId));
		}

		cidade.setEstado(estado);

		return cidadeRepository.salvar(cidade);
	}

	public void excluir(Long cidadeId) {
		try {
			cidadeRepository.remover(cidadeId);

		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe um cadastro de cidade com código %d", cidadeId));

		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Cidade de código %d não pode ser removida, pois está em uso", cidadeId));
		}
	}

}
