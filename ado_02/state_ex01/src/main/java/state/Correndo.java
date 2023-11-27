package state;

/**
 *
 * @author ian.spereira
 */

import cliente.Acoes;

public class Correndo implements Estados {
    private String mensagem = "Correndo";
    private Acoes acao;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Acoes getAcao() {
        return acao;
    }

    public void setAcao(Acoes acao) {
        this.acao = acao;
    }

    public Correndo(Acoes acao) {
        this.acao = acao;
    }

    @Override
    public void correr() {
        System.out.println("Já esta correndo!");
    }
    
    @Override
    public void esperar() {
        acao.setEstado(new Esperando(acao));
    }
    
    @Override
    public void pular() {
        acao.setEstado(new Pulando(acao));
    }
    
    @Override
    public void abaixar() {
        acao.setEstado(new Abaixando(acao));        
    }

    @Override
    public String toString() {
        return "Correndo [mensagem=" + mensagem + "]";
    }

}
