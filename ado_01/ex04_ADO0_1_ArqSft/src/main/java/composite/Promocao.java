/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.text.DecimalFormat;

public class Promocao implements Composite {
    private String nome;
    private double preco;
    private double desconto;

    public Promocao(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double getPrecoTotal() {
        return preco * (1 - desconto);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String precoTotalFormatado = df.format(getPrecoTotal());
        return "\nProduto em promoção: " +
                "\n\tNome: '" + nome + "'" +
                "\n\tPreço: R$" + preco +
                "\n\tPreço com desconto: R$" + precoTotalFormatado +
                "\n\tDesconto: " + desconto * 100 + "%";
    }
}