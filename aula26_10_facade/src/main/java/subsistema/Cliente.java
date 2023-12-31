package subsistema;

/**
 *
 * @author ian.spereira
 */
public class Cliente {

    private String nome;
    private long id;

    public Cliente() {
    }

    public Cliente(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    // função que pesquisa o cliente pelo ID atraves da lista gerada no banco
    public Cliente pesquisarClienteId(long id) {
        Banco banco = new Banco();
        banco.carregarDados();
        for (Cliente c : banco.getListaClientes()) {
            if (id == c.getId()) {
                return c;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n\tNome: " + nome + "\n\tId: " + id;
    }
}
