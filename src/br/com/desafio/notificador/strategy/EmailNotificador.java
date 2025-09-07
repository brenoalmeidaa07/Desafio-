package br.com.desafio.notificador.strategy;

public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por E-MAIL: \"" + mensagem + "\"");
    }
}