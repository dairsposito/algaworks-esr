package com.daga.dagafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daga.dagafood.di.modelo.Cliente;
import com.daga.dagafood.di.notificacao.NivelUrgencia;
import com.daga.dagafood.di.notificacao.Notificador;
import com.daga.dagafood.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.TARDIO)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
