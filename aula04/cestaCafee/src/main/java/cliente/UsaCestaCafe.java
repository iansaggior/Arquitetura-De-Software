/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

/**
 *
 * @author ian.spereira
 */
import composite.*;
public class UsaCestaCafe {

    public static void main(String[] args) {
        Composite cesta = new Composite();
        
        Component caneca = new Leaf("Caneca", 23.45);
        Component manteiga = new Leaf("Manteiga", 7.75);
        Component cafe = new Leaf("Cafe Pilao", 20.57);
        
        cesta.add(caneca); 
        cesta.add(manteiga);
        cesta.add(cafe);
        
        Component uvas = new Leaf("Uvas", 30.32);
        Component morango = new Leaf("Morango", 30.51);
        Composite caixaFrutas = new Composite();
        caixaFrutas.add(uvas);
        caixaFrutas.add(morango);
        
        cesta.add(caixaFrutas);
        
        System.out.println("Total cesta: " + cesta.getPreco());
        System.out.println(cesta);
    }
    
}

