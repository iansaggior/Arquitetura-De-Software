// concret subject
package padrao;
/**
 *
 * @author ian.spereira
 */
import java.util.*;
public class NaveJogador implements Subject {
    
    private String nome;
    private Acao acao;
    private List<Observer> lista;
    
    public NaveJogador (String nome) {
        this.nome = nome;
        lista = new ArrayList<>();
    }

    @Override
    public void adcionarObvd(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void adcionarAcao(Acao acao) {
        this.acao = acao;
        notificar();
    }

    @Override
    public void notificar() {
        for(Observer obs: lista) {
            obs.atualizar(acao);
        }
    }
    
}
