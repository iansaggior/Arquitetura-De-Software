package state;

import cliente.Acoes;

/**
 *
 * @author ian.spereira
 */

public class Abaixando implements Estados {
    private String mensagem = "Abaixando";
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
    public Abaixando(Acoes acao) {
        this.acao = acao;
    }
    
    @Override
    public void abaixar() {
        System.out.println("Já está abaixado!");        
    }
    @Override
    public void correr() {
        System.out.println("Só é possivel correr quando estiver esperando ou pulando");        
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
    public String toString() {
        return "Abaixando [mensagem=" + mensagem + "]";
    }
    
    

    }
