package com.daga.dagafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.daga.dagafood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo a nota fiscal para cliente " + event.getCliente().getNome());
	}
}
