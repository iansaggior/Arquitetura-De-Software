package clientee;

import padrao.*;

public class Jogo {

    public static void main(String[] args) {
        // Criando jogador como singleton
        NaveJogador naveJ = NaveJogador.getInstance("Gerson");

        // Criando inimigas
        NaveInimiga naveI1 = new NaveInimiga("Inimiga 1", naveJ);
        NaveInimiga naveI2 = new NaveInimiga("Inimiga 2", naveJ);

        // Adicionando a��es ao jogador
        naveJ.adicionarAcao(Acao.AVANCAR);
        naveJ.adicionarAcao(Acao.RECUAR);
        naveJ.adicionarAcao(Acao.VIRAR_DIR);

        // Removendo uma nave inimiga (simulando a destrui��o)
        naveJ.removerObservador(naveI1);

        // Adicionando mais a��es ao jogador
        naveJ.adicionarAcao(Acao.RECUAR);
        naveJ.adicionarAcao(Acao.VIRAR_ESQ);
    }

}
