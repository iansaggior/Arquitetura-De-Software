/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

public class Produto implements Composite {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPrecoTotal() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nProduto: " +
                "\n\tNome: '" + nome + "'" +
                "\n\tPreço: R$" + preco;
    }
}