/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.*;

public class CarrinhoDeCompras implements Composite {
    private List<Composite> produtos = new ArrayList<>();

    public void adicionarProduto(Composite produto) {
        produtos.add(produto);
    }

    public void removerProduto(Composite produto) {
        produtos.remove(produto);
    }

    @Override
    public double getPrecoTotal() {
        double total = 0;
        for (Composite produto : produtos) {
            total += produto.getPrecoTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras: " + produtos;
    }
}
