package com.daga.dagafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.daga.dagafood.di.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.dagamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
}
