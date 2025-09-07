package br.com.desafio.notificador;

import br.com.desafio.notificador.enums.TipoNotificacao;
import br.com.desafio.notificador.service.ServicoDeNotificacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Sistema de Notificações ---");

        ServicoDeNotificacao servico = ServicoDeNotificacao.getInstancia();

        String mensagemPromocao = "Aproveite nossa promoção de 50% de desconto!";
        
        servico.enviarNotificacao(TipoNotificacao.EMAIL, mensagemPromocao);
        servico.enviarNotificacao(TipoNotificacao.SMS, mensagemPromocao);
        
        System.out.println("\n----------------------------------------\n");
        
        String mensagemAlerta = "Sua fatura fecha em 3 dias.";
        
        servico.enviarNotificacao(TipoNotificacao.PUSH, mensagemAlerta);
        servico.enviarNotificacao(TipoNotificacao.EMAIL, mensagemAlerta);
        
        System.out.println("\n--- Sistema de Notificações Finalizado ---");
    }
}