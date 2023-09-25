/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author iansa
 */
import java.util.*;

public class CarrinhoDeCompras implements ProdutoInterface {
    private List<ProdutoInterface> produtos = new ArrayList<>();

    public void adicionarProduto(ProdutoInterface produto) {
        produtos.add(produto);
    }

    public void removerProduto(ProdutoInterface produto) {
        produtos.remove(produto);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ProdutoInterface produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "produtos=" + produtos +
                '}';
    }
}
