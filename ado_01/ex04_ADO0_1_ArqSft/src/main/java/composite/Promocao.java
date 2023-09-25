/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author iansa
 */
public class Promocao implements ProdutoInterface {
    private String nome;
    private double preco;
    private double desconto;

    public Promocao(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return preco * (1 - desconto);
    }

    @Override
    public String toString() {
        return "Promocao: " +
                "\nNome='" + nome + '\'' +
                "\nPreco=" + preco +
                "\nDesconto=" + desconto;
    }
}