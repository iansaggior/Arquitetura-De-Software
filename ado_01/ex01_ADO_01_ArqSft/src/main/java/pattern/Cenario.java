/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

public class Cenario extends Thread{
  @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    } 
}
