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
};
