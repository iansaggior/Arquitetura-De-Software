/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exemplo;

/**
 *
 * @author ian.spereira
 */
import exemplo.Externa.Interna;
public class ProjetoExemplos_classes_Internas {
    public static void main(String[] args) {
        Externa externa = new Externa();
        externa.exibir();
        
        Interna interna = externa.new Interna();
        interna.exibir();
    }
}