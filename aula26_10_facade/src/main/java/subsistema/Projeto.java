package subsistema;

/**
 *
 * @author ian.spereira
 */
public class Projeto {

    private String nome;
    private int id;
    private String dataInicio;
    private String dataFim;

    public Projeto() {
    }

    public Projeto(String nome, int id, String dataInicio, String dataFim) {
        this.nome = nome;
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // função que pesquisa o projeto pelo ID atraves da lista gerada no banco
    public Projeto pesquisarProjetoId(int id) {
        Banco banco = new Banco();
        banco.carregarDados();
        for (Projeto p : banco.getListaProjetos()) {
            if (id == p.getId()) {
                return p;
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

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "\n\tNome: " + nome + "\n\tId: " + id + "\n\tDataInicio: " + dataInicio + "\n\tDataFim: " + dataFim;
    }

}
