/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

/**
 *
 * @author iansa
 */
import tanque.*;

public class Cenario {

    public static void main(String[] args) {
        Tanque tq = new Tanque(CoresRGB.RED, CoresRGB.BLUE, 2, 4);
        tq.movLeste();
        tq.movLeste();
        tq.movLeste();
        tq.atirar(2);
        System.out.println("X="+tq.retPosicaoX()+" Y="+tq.retPosicaoY());
    }
}
