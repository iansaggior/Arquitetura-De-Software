package state;

/**
 *
 * @author ian.spereira
 */

import cliente.Acoes;

public class Esperando implements Estados {
    private String mensagem = "Esperando";
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

    public Esperando(Acoes acao) {
        this.acao = acao;
    }

    @Override
    public void correr() {
        acao.setEstado(new Correndo(acao));
    }

    @Override
    public void esperar() {
        System.out.println("Já está esperando");
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
        return "Esperando [mensagem=" + mensagem + "]";
    }
    
}
