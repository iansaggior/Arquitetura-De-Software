/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

/**
 *
 * @author ian.spereira
 */
public class Externa {
    public void exibir() {
        System.out.println("Classe externa");
    }
    public class Interna {
        public void exibir() {
            System.out.println("Classe Interna");
        }    
    }
}