/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

/**
 *
 * @author ian.spereira
 */
import padrao.*;
public class Jogo {

    public static void main(String[] args) {
        Subject naveJ = new NaveJogador("Mileam Falcum");
        Observer naveI1 = new NaveInimiga("Inimiga 1", naveJ);
        
        naveJ.adcionarAcao(Acao.AVANCAR);
        naveJ.adcionarAcao(Acao.RECUAR);
        naveJ.adcionarAcao(Acao.VIRAR_DIREITA);
        naveJ.adcionarAcao(Acao.VIRAR_DIREITA);
        
        Observer naveI2 = new NaveInimiga("Inimiga 2", naveJ);
        naveJ.adcionarAcao(Acao.AVANCAR);
        naveJ.adcionarAcao(Acao.RECUAR);
    }
}
