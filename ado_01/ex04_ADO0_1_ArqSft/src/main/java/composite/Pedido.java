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

public class Pedido {
    private String nomeCliente;
    private List<ProdutoInterface> lista;
    private int numeroPedido;

    public Pedido(String nomeCliente, List<ProdutoInterface> lista, int numeroPedido) {
        this.nomeCliente = nomeCliente;
        this.lista = lista;
        this.numeroPedido = numeroPedido;
    }

    public double getTotalCompra() {
        double total = 0;
        for (ProdutoInterface produto : lista) {
            total += produto.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido " +
                "\nNomeCliente='" + nomeCliente + '\'' +
                "\nLista=" + lista +
                "\nNumeroPedido=" + numeroPedido +
                "\nTotalCompra=" + getTotalCompra();
    }
}
