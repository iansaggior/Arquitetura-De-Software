/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import java.util.*;
import composite.*;

public class UsaCarrinhoCompras {
    public static void main(String[] args) {
        Composite caneca = new Produto("Caneca", 23.45);
        Composite manteiga = new Produto("Manteiga", 7.75);
        Composite cafe = new Produto("Cafe Pilao", 20.57);

        Composite uvas = new Promocao("Uvas", 30.32, 0.27);
        Composite morango = new Promocao("Morango", 30.51, 0.11);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(caneca);
        carrinho.adicionarProduto(manteiga);
        carrinho.adicionarProduto(cafe);

        carrinho.adicionarProduto(uvas);
        carrinho.adicionarProduto(morango);

        List<Composite> produtosDoPedido = new ArrayList<>();
        produtosDoPedido.add(carrinho);

        Pedido pedido = new Pedido("João", produtosDoPedido);

        System.out.println(pedido);
    }

}
