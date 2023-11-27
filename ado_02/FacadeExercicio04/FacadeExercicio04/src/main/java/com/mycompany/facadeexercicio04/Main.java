/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.facadeexercicio04;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EstoqueFacade estoqueFacade = new EstoqueFacade();

        // Adiciona alguns produtos diretamente ao estoque
        Produto produto1 = new Produto();
        produto1.setCodigo(1);
        produto1.setPreco(10.0);
        produto1.setCategoria("Eletrônicos");
        estoqueFacade.adicionarProduto(produto1, 50);

        Produto produto2 = new Produto();
        produto2.setCodigo(2);
        produto2.setPreco(5.0);
        produto2.setCategoria("Roupas");
        estoqueFacade.adicionarProduto(produto2, 100);

        // Adiciona um item ao pedido (considerando que há estoque suficiente)
        Pedido pedido = new Pedido();
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produto1);
        itemPedido.setQuantidade(5);
        pedido.adicionarItem(itemPedido, estoqueFacade);

        // Exibe o cupom fiscal
        pedido.cupomFiscal();

        // Exibe a lista de estoque
        List<ItemEstoque> listaEstoque = estoqueFacade.obterListaEstoque();
        System.out.println("\nLista de Estoque:");
        for (ItemEstoque itemEstoque : listaEstoque) {
            System.out.println("Produto: " + itemEstoque.getProduto().getCodigo() +
                    ", Quantidade: " + itemEstoque.getQuantidade());
        }
    }
}
