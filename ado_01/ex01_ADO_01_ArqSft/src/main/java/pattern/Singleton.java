/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

public class Singleton {
  private static Singleton singleton = new Singleton();
  
  private Singleton(){
  }
  
  public static Singleton getInstance(){
    return singleton;
  }
}
