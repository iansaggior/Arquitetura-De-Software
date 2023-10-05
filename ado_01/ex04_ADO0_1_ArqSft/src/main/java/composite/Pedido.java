/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.text.DecimalFormat;
import java.util.*;

public class Pedido {
    private static int contadorNumeroPedido = 1;
    private String nomeCliente;
    private List<Composite> lista;
    private int numeroPedido;
    private double totalCompra;

    public Pedido(String nomeCliente, List<Composite> lista) {
        this.nomeCliente = nomeCliente;
        this.lista = lista;
        this.numeroPedido = contadorNumeroPedido++;
        getTotalCompra();
    }

    private void getTotalCompra() {
        totalCompra = 0;
        for (Composite produto : lista) {
            totalCompra += produto.getPrecoTotal();
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String totalCompraFormatado = df.format(totalCompra);
        return "Pedido: " + numeroPedido +
                "\nCliente= '" + nomeCliente + '\'' +
                "\nLista= \n\n" + lista +
                "\n\nTotalCompra: R$" + totalCompraFormatado;
    }
}
