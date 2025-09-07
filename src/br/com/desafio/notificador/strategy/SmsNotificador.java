package br.com.desafio.notificador.strategy;

public class SmsNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por SMS: \"" + mensagem + "\"");
    }
}