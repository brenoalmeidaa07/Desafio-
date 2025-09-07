package br.com.desafio.notificador.service;

import br.com.desafio.notificador.enums.TipoNotificacao;
import br.com.desafio.notificador.factory.NotificadorFactory;
import br.com.desafio.notificador.strategy.Notificador;

public class ServicoDeNotificacao {

    private static ServicoDeNotificacao instancia;
    private final NotificadorFactory factory;

    private ServicoDeNotificacao() {
        this.factory = new NotificadorFactory();
    }

    public static synchronized ServicoDeNotificacao getInstancia() {
        if (instancia == null) {
            instancia = new ServicoDeNotificacao();
        }
        return instancia;
    }

    public void enviarNotificacao(TipoNotificacao tipo, String mensagem) {
        Notificador notificador = factory.criarNotificador(tipo);
        notificador.enviar(mensagem);
    }
}