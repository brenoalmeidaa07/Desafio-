package br.com.desafio.notificador.factory;

import br.com.desafio.notificador.enums.TipoNotificacao;
import br.com.desafio.notificador.strategy.EmailNotificador;
import br.com.desafio.notificador.strategy.Notificador;
import br.com.desafio.notificador.strategy.PushNotificador;
import br.com.desafio.notificador.strategy.SmsNotificador;

public class NotificadorFactory {

    public Notificador criarNotificador(TipoNotificacao tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("O tipo de notificação não pode ser nulo.");
        }

        switch (tipo) {
            case EMAIL:
                return new EmailNotificador();
            case SMS:
                return new SmsNotificador();
            case PUSH:
                return new PushNotificador();
            default:
                throw new IllegalArgumentException("Tipo de notificação desconhecido: " + tipo);
        }
    }
}