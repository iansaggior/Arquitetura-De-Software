/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import java.util.ArrayList;
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
        if (opc > 0 && opc <= 3) {
            System.out.println("Valor do frete: " + frete);
        } else 
            System.err.println("Opção invalida");
        {
            
        }
//        else if (opc == 2) 
//        {
//            frete = ListaEmpresas.CBA.calcularFrete(p1.getPeso());
//        } 
//        else if (opc == 3)
//        {
//            frete = ListaEmpresas.XPTO.calcularFrete(p1.getPeso());
//        } 
//        else 
//        {
//        System.err.println("Opçção Invalida");
//                
//        }
//        //double frete = e.calcularFrete(p1.getPeso());
//        if (opc < 3) {
//            System.out.println("Valor do frete: " + frete);
//        }
    }
    
//    public static double calcularFrete(String nomeEmpresa, double peso) {
//        double frete = 0;
//        if (nomeEmpresa.equals("XPTO")) 
//        {
//            if (peso <= 5) 
//            {
//                frete = 12;
//            } 
//            else if (peso <= 10) 
//            {
//                frete = 15.2;
//            } 
//            else {
//                frete = 21.2;
//            }
//        } 
//        else if (nomeEmpresa.equals("ABC")) 
//        {
//            if (peso <= 5) 
//            {
//                frete = 12.6;    
//            } 
//            else if (peso <=10) 
//            {
//                frete = 22.6;
//            } 
//            else 
//            {
//                frete = 32.6;
//            }
//        } 
//        else 
//        {
//            if (peso <= 5) 
//            {
//                frete = 23.1;                
//            } 
//            else if (peso <= 10) 
//            {
//                frete = 30;
//            } 
//            else {
//                frete = 40;
//            }
//        }
//        return frete;
//    }
}
