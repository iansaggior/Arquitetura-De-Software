/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cliente;

import java.util.*;
import javax.swing.JOptionPane;

import modelo.*;
import strategy.*;

/**
 *
 * @author iansa
 */
public class UsaStrategy {

    public static void main(String[] args) {
        try {
            ArrayList<Produto> produtos = new ArrayList<>();
            int qtdProd = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite quantos produtos irão ter no orçamento: "));

            for (int i = 1; i <= qtdProd; i++) {
                String nomeProd = JOptionPane.showInputDialog("Digite o nome do " + i + "º produto:");
                double precoProd = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do " + i + "º produto:"));
                Produto prod = new Produto(nomeProd, precoProd);
                produtos.add(prod);
            }

            ArrayList<Servico> servicos = new ArrayList<>();

            int confOrca = JOptionPane.showConfirmDialog(null, "Seu orçamento possui serviços?");
            if (confOrca == 0) {
                int qtdServ = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite quantos serviços irão ter no orçamento: "));

                if (qtdServ != 0) {
                    for (int i = 1; i <= qtdServ; i++) {
                        String nomeServ = JOptionPane.showInputDialog("Digite o nome do " + i + "º serviço:");
                        double precoServ = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do " + i + "º serviço:"));
                        Servico serv = new Servico(nomeServ, precoServ);
                        servicos.add(serv);
                    }
                }
            }

            // variavel que soma o preço de todos os produtos
            double somaValorProd = 0;
            for (Produto produto : produtos) {
                somaValorProd += (produto.getValorProduto());
            }

            // variavel que soma o preço de todos os produtos
            double somaValorServ = 0;
            for (Servico servico : servicos) {
                somaValorServ += (servico.getValorServico());
            }

            double valorTotalOcamento = somaValorProd + somaValorServ;

            String[] options = {
                "IPTO01",
                "IPTO02",
                "IPTO03",
                "SAIR"
            };
            int option = JOptionPane.showOptionDialog(null, null, "Escolha uma opção",
                    JOptionPane.INFORMATION_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (option > 2) {
                System.err.println("SAINDO...");
            } else {

                System.out.println(produtos.toString().
                        replace("[", "Produtos:\n").
                        replace("]", "").
                        replace(",", "\n"));
                if (confOrca == 0) {
                    System.out.println(servicos.toString().
                            replace("[", "Serviços:\n").
                            replace("]", "").
                            replace(",", "\n"));
                }

                System.out.println("Valor total do Orçamento sem os impostos = " + valorTotalOcamento + "\n");

                CalcOrcam clOrc = OpcImposto.values()[option].opcaoCalcOrca();
                System.out.println(clOrc.calcularOrcamento(valorTotalOcamento));
            }
        } catch (Exception e) {
            System.err.println("DEU ALGUMA XAROPADA AI, CONSULTE O FORNECEDOR DO CODIGO PARA MAIS DETALHES");
            System.out.println(e);
        }
    }
}
