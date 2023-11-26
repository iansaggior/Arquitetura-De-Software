package state;
import cliente.Acoes;

/**
 *
 * @author ian.spereira
 */

public class Pulando implements Estados {
    private String mensagem = "Pulando";
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
    
    public Pulando(Acoes acao) {
        this.acao = acao;
    }
    @Override
    public void correr() {
        acao.setEstado(new Correndo(acao));
    }
    
    @Override
    public void esperar() {
        acao.setEstado(new Esperando(acao));        
    }
    
    @Override
    public void pular() {
        System.out.println("Já está pulando!");
    }

    @Override
    public void abaixar() {
        acao.setEstado(new Abaixando(acao));        
    }
    
    @Override
    public String toString() {
        return "Pulando [mensagem=" + mensagem + "]";
    }
    
    
}
