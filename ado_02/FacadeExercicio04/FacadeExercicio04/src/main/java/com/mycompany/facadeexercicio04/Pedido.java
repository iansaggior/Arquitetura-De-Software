/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadeexercicio04;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedido {

    private double valorTotal;
    private List<ItemPedido> lista = new ArrayList<>();
    private Estoque estoque;

    public void adicionarItem(ItemPedido item, EstoqueFacade estoqueFacade) {
        Produto produto = item.getProduto();
        int quantidadePedido = item.getQuantidade();

        int quantidadeEstoque = obterQuantidadeDisponivelNoEstoque(produto);

        if (quantidadeEstoque >= quantidadePedido) {
            lista.add(item);
            estoque.removerProduto(produto, quantidadePedido);
        } else {
            System.out.println("Não há estoque suficiente para adicionar o item ao pedido.");
        }
    }

    private int obterQuantidadeDisponivelNoEstoque(Produto produto) {
        // Lógica para obter a quantidade disponível no estoque para um determinado
        // produto
        // (pode ser implementado na classe Estoque)
        // ...
        return 0; // Substitua por sua implementação real
    }

    public double calcularTotal() {

        valorTotal = 0.0;

        for (ItemPedido item : lista) {
            double precoItem = item.getProduto().getPreco();
            int quantidadeItem = item.getQuantidade();
            valorTotal += precoItem * quantidadeItem;
        }
        return valorTotal;
    }

    public void cupomFiscal() {
        System.out.println("*********** Cupom Fiscal ***********");
        System.out.println("Data: " + obterDataAtualFormatada());
        System.out.println("-----------------------------------");

        for (ItemPedido item : lista) {
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();
            double precoItem = produto.getPreco() * quantidade;

            System.out.println(produto.getCategoria() + " - Código: " + produto.getCodigo() +
                    " - Descrição: " + produto.getCategoria() + " - Quantidade: " + quantidade +
                    " - Preço Unitário: " + produto.getPreco() + " - Subtotal: " + precoItem);
        }

        System.out.println("-----------------------------------");
        System.out.println("Valor Total: " + calcularTotal());
        System.out.println("********** Fim do Cupom **********");
    }

    public String obterDataAtualFormatada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }

}
