package cliente;

/**
 *
 * @author ian.spereira
 */

public class GerenciadorEstados {
    public static void main(String[] args) {
        Acoes acao = new Acoes("Requisitar ação");
        acao.chamarEsperar();        
        acao.chamarCorrer();
        acao.chamarCorrer();
        acao.chamarAbaixar();
        acao.chamarEsperar();
        acao.chamarAbaixar();
        acao.chamarCorrer();
        acao.chamarPular();
        acao.chamarEsperar();
        acao.chamarPular();
        acao.chamarPular();
    }
}
