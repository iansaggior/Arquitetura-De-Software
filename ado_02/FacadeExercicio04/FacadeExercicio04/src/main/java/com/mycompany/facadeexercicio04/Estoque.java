/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadeexercicio04;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<ItemEstoque> listaEstoque = new ArrayList<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        ItemEstoque itemEstoque = new ItemEstoque(produto, quantidade);
        listaEstoque.add(itemEstoque);
    }

    public List<ItemEstoque> obterListaEstoque() {
        return listaEstoque;
    }

    public void removerProduto(Produto produto, int quantidade) {
        ItemEstoque itemRemover = null;
        for (ItemEstoque item : listaEstoque) {
            if (item.getProduto().getCodigo() == produto.getCodigo()) {
                itemRemover = item;
                break;
            }
        }

        if (itemRemover != null) {
            int quantidadeAtual = itemRemover.getQuantidade();

            if (quantidadeAtual >= quantidade) {
                itemRemover.setQuantidade(quantidadeAtual - quantidade);
            } else {
                listaEstoque.remove(itemRemover);
            }
        }
    }
}
