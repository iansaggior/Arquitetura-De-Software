package padrao;

public class NaveInimiga implements Observer{
    private String nome;

    public NaveInimiga(String nome, Subject subj) {
        this.nome = nome;
        subj.adicionarObservador(this);
    }

    @Override
    public void atualizar(Acao acao) {
        System.out.println(nome+" "+acao);
    }

}
