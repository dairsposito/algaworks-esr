package com.daga.dagafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.daga.dagafood.domain.model.Restaurante;
import com.daga.dagafood.domain.repository.RestauranteRepository;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> listar() {
		return manager.createQuery("from Restaurante", Restaurante.class)
				.getResultList();
	}

	@Override
	public Restaurante buscar(Long id) {
		return manager.find(Restaurante.class, id);
	}

	@Override
	@Transactional
	public Restaurante salvar(Restaurante restaurante) {
		return manager.merge(restaurante);
	}

	@Override
	@Transactional
	public void remover(Restaurante restaurante) {
		restaurante = buscar(restaurante.getId());
		manager.remove(restaurante);
	}

}
