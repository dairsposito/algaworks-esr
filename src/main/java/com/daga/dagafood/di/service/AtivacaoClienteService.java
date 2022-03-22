package com.daga.dagafood.di.service;

import org.springframework.stereotype.Component;
import com.daga.dagafood.di.modelo.Cliente;
import com.daga.dagafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	private NotificadorEmail notificador;

	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
