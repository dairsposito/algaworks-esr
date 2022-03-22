package com.daga.dagafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.daga.dagafood.di.notificacao.Notificador;
import com.daga.dagafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
