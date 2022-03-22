package com.daga.dagafood.di.notificacao;

import com.daga.dagafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}