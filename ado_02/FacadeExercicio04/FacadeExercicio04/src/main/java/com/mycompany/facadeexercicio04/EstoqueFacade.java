/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadeexercicio04;

import java.util.List;

public class EstoqueFacade {

    private Estoque estoque;

    public EstoqueFacade() {
        this.estoque = new Estoque();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    public List<ItemEstoque> obterListaEstoque() {
        return estoque.obterListaEstoque();
    }

    public void removerProduto(Produto produto, int quantidade) {
        estoque.removerProduto(produto, quantidade);
    }
}
