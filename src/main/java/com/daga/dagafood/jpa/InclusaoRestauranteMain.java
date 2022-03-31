package com.daga.dagafood.jpa;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.daga.dagafood.DagaFoodApiApplication;
import com.daga.dagafood.domain.model.Restaurante;
import com.daga.dagafood.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(DagaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Joka's Grill");
		restaurante1.setTaxaFrete(new BigDecimal(8.43));

		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Zica Comidaria");
		restaurante2.setTaxaFrete(new BigDecimal(4.29));

		restaurante1 = restauranteRepository.salvar(restaurante1);
		restaurante2 = restauranteRepository.salvar(restaurante2);

		System.out.printf("%d - %s - %.2f\n", restaurante1.getId(), restaurante1.getNome(), restaurante1.getTaxaFrete());
		System.out.printf("%d - %s - %.2f\n", restaurante2.getId(), restaurante2.getNome(), restaurante2.getTaxaFrete());

	}
}
