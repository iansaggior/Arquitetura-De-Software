/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

/**
 *
 * @author ian.spereira
 */
public class Argo implements Carro {

    private double preco;
    private String modelo;

    public Argo(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }
    
    
    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Argo{" + "preco=" + preco + ", modelo=" + modelo + '}';
    }  
}
