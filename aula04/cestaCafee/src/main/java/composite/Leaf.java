/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author ian.spereira
 */
public class Leaf implements Component{
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
//    public double getPreco() {
//        return preco;
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//    
    
    public Leaf() {
    }

    public Leaf(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    
    @Override
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "Leaf{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
}
