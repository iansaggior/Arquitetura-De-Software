/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import java.util.*;

import modelo.Produto;
import strategy.*;

/**
 *
 * @author ian.spereira
 */
public class LojaVirtual {

    public static void main(String[] args) {
        try {
            int opc = 0;
            Scanner scanner = new Scanner(System.in);
            ArrayList<Produto> produtos = new ArrayList<>();
            System.out.print("Digite quantos produtos voce ira cadastrar: ");
            int qtdProd = scanner.nextInt();

            for (int i = 1; i <= qtdProd; i++) {
                System.out.print("Digite o nome do " + i + "º produto:\t");
                String nome = scanner.next();
                System.out.print("Digite o preco do " + i + "º produto:\t");
                int preco = scanner.nextInt();
                System.out.print("Digite o peso do " + i + "º  produto:\t");
                int peso = scanner.nextInt();

                Produto produto = new Produto(nome, preco, peso);
                produtos.add(produto);
            }

            System.out.println("Digite qual empresa será responsavel pelo calculo frete:" +
                                                                            "\n(1) ABC" +
                                                                            "\n(2) CBA" +
                                                                            "\n(3) XPTO\n");
            opc = scanner.nextInt();


            ArrayList<Double> fretes = new ArrayList<>();
            double frete = 0;
            for (Produto produto : produtos) {
                frete = ListaEmpresas.values()[opc - 1].calcularFrete(produto.getPeso());
                fretes.add(frete);
            }

            System.out.println(produtos.toString().
            replace("[","Produtos:\n").
            replace("]","").
            replace(",","\n"));

            System.out.println("Valores do frete respectivamente:\n " + fretes.toString().
            replace("[", "").
            replace("]", ""));

        } catch (Exception e) {
            System.err.println("Opção inválida! \nInsira um valor entre 1 e 3");
        }
    }
}
