package subsistema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ian.spereira
 */
// simulação de um bancode dados
public class Banco {

    // declara as listas do determinados tipos
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Gerente> listaGerentes = new ArrayList<>();
    private List<Projeto> listaProjetos = new ArrayList<>();

    // trecho em que são adicionados dados nas listas
    public void carregarDados() {
        listaClientes.add(new Cliente("Mel", 123));
        listaClientes.add(new Cliente("Gaia", 456));

        listaGerentes.add(new Gerente("Tonica", 1));
        listaGerentes.add(new Gerente("Mustafa", 3));
        listaGerentes.add(new Gerente("Ronda", 6));

        listaProjetos.add(new Projeto("Loja Mel", 23, "23/06/23", "12/07/24"));
        listaProjetos.add(new Projeto("Loja Gaia", 45, "12/02/23", "28/12/24"));
    }

    // funções que retornam os dados das listas
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public List<Gerente> getListaGerentes() {
        return listaGerentes;
    }
    
    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }
}
