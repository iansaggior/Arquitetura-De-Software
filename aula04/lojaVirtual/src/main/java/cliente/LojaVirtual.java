/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import java.util.*;
import java.util.Scanner;
import modelo.Produto;
import strategy.*;

/**
 *
 * @author ian.spereira
 */
public class LojaVirtual {

    public static void main(String[] args) {
        int opc = 0;
        Scanner scanner = new Scanner(System.in);
        Produto p1 = new Produto("Geladeira", 3200, 10);
        CalcularFreteEmpresas e = null;
        System.out.println("Digite qual opção será utilizada: ");
        opc = scanner.nextInt();
        ArrayList<Integer> valores = new ArrayList<>();
        double frete = 0;
                
        frete = ListaEmpresas.values()[opc-1].calcularFrete(p1.getPeso());
        if (opc > 0 && opc <= 3) 
        {
            System.out.println(p1);
            System.out.println("Valor do frete: " + frete);
        } else 
        {
            System.err.println("Opção invalida");
        }
    }
}
