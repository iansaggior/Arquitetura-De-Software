package padrao;
// concret Observer
/**
 *
 * @author ian.spereira
 */
public class NaveInimiga implements Observer {

    private String nome;
    
    public NaveInimiga(String nome, Subject subj) {
        this.nome = nome;
        subj.adcionarObvd(this);
    }
    
    @Override
    public void atualizar(Acao acao) {
        System.out.println("A nave inimiga " + nome+ " " + acao);
    }
    
}
