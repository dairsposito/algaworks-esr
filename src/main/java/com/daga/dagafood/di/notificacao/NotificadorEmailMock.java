package com.daga.dagafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.daga.dagafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.TARDIO)
@Component
public class NotificadorEmailMock implements Notificador {

	@Autowired
	private NotificadorProperties properties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: " + properties.getHostServidor());
		System.out.println("Porta: " + properties.getPortaServidor());
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
