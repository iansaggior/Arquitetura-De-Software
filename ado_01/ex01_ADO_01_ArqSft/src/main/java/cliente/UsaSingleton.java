/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

/**
 *
 * @author iansa
 */
import pattern.Singleton;

public class UsaSingleton {

    public static void main(String[] args) {
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
        Singleton singleton03 = Singleton.getInstance();

        System.out.println(singleton01);
        System.out.println(singleton02);
        System.out.println(singleton03);
    }

}
