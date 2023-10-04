/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cliente;

import pattern.Cenario;

public class UsaSingleton {

    public static void main(String[] args) {
        Cenario cenario1 = new Cenario();
        Cenario cenario2 = new Cenario();
        cenario1.start();
        cenario2.start();
    }
}
