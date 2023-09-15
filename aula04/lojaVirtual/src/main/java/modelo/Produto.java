/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ian.spereira
 */
public class Produto 
{
    private String descrisao;
    private double preco;
    private double peso;

    
    public Produto() 
    {
    }
    
    public Produto(String descrisao, double preco, double peso) 
    {
        this.descrisao = descrisao;
        this.preco = preco;
        this.peso = peso;
    }

    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" + "descrisao = " + descrisao + ", preco = " + preco + ", peso = " + peso + '}';
    }

}
