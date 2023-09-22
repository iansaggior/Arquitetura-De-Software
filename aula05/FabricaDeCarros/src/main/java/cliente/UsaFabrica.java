/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

/**
 *
 * @author ian.spereira
 */

import fabrica.*;
public class UsaFabrica {

    public static void main(String[] args) {
        Criadora f = new FabricaFiat();
        Carro carro = f.metodoFabrica(Tipo.ARGO);
        System.out.println(carro);
    }
}
