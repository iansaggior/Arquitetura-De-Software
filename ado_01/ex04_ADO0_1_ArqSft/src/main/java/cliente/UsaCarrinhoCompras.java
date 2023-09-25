/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iansa
 */
import composite.*;

public class UsaCarrinhoCompras {
    public static void main(String[] args) {
        ProdutoInterface caneca = new Promocao("Caneca", 23.45, 0.1);
        ProdutoInterface manteiga = new Promocao("Manteiga", 7.75, 0.05);
        ProdutoInterface cafe = new Promocao("Cafe Pilao", 20.57, 0.15);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(caneca);
        carrinho.adicionarProduto(manteiga);
        carrinho.adicionarProduto(cafe);

        ProdutoInterface uvas = new Promocao("Uvas", 30.32, 0.2);
        ProdutoInterface morango = new Promocao("Morango", 30.51, 0.1);

        CarrinhoDeCompras caixaFrutas = new CarrinhoDeCompras();
        caixaFrutas.adicionarProduto(uvas);
        caixaFrutas.adicionarProduto(morango);

        carrinho.adicionarProduto(caixaFrutas);

        List<ProdutoInterface> produtosDoPedido = new ArrayList<>();
        produtosDoPedido.add(carrinho);

        Pedido pedido = new Pedido("João", produtosDoPedido, 1);

        System.out.println(pedido);
    }

}
