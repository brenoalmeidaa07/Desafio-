package br.com.desafio.notificador.strategy;

public class PushNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação PUSH: \"" + mensagem + "\"");
    }
}