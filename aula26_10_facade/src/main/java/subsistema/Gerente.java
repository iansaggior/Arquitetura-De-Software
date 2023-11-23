package subsistema;

/**
 *
 * @author ian.spereira
 */
public class Gerente {

    private String nome;
    private int id;

    public Gerente() {
    }

    public Gerente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // função que pesquisa o gerente pelo ID atraves da lista gerada no banco
    public Gerente pesquisarGerenteId(int id) {
        Banco banco = new Banco();
        banco.carregarDados();
        for (Gerente g : banco.getListaGerentes()) {
            if (id == g.getId()) {
                return g;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n\tNome: " + nome + "\n\tId: " + id;
    }

}
