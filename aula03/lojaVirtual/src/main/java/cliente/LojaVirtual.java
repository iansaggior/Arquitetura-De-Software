/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import modelo.Produto;
import strategy.*;

/**
 *
 * @author ian.spereira
 */
public class LojaVirtual {

    public static void main(String[] args) {
        Produto p1 = new Produto("Geladeira", 3200, 10);
        CalcularFreteEmpresas e = new CBA();
        double frete = e.calcularFrete(p1.getPeso());
        System.out.println("Valor do frete: " + frete);
    }
}
