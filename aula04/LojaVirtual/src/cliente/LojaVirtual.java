package cliente;

import modelo.Produto;
import strategy.*;

/*
*  Professor Gerson Risso
 */
public class LojaVirtual {

    public static void main(String[] args) {
        Produto p1 = new Produto("Geladeira", 3200, 30);
        CalcularFreteEmpresas e=new CBA();
        double frete=e.calcularFrete(p1.getPeso());
        System.out.println(frete);
    }
}
