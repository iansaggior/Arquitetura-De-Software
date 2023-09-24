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

                if (qtdServ !=0) {
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


            CalcOrcam calcIpto01 = new IPTO1();
            CalcOrcam calcIpto02 = new IPTO2();
            CalcOrcam calcIpto03 = new IPTO3();

            double orca01 = calcIpto01.calcularOrcamento(valorTotalOcamento);
            double orca02 = calcIpto02.calcularOrcamento(valorTotalOcamento);
            double orca03 = calcIpto03.calcularOrcamento(valorTotalOcamento);

            System.out.println(produtos.toString().
                                replace("[","Produtos:\n").
                                replace("]","").
                                replace(",","\n"));
            System.out.println(servicos.toString().
                                replace("[","Serviços:\n").
                                replace("]","").
                                replace(",","\n"));
            
            System.out.println("Valor total do Orçamento sem os impostos = " + valorTotalOcamento);

            System.out.println("Valor do Orçamento com o imposto IPTO01: " + valorTotalOcamento + " + 10% = " + orca01);
            System.out.println("Valor do Orçamento com o imposto IPTO02: " + valorTotalOcamento + " + 15% = " + orca02);
            System.out.println("Valor do Orçamento com o imposto IPTO03: " + valorTotalOcamento + " + 25% = " + orca03);

        } catch (Exception e) {
            System.err.println("DEU ALGUMA XAROPADA AI, CONSULTE O FORNECEDOR DO CODIGO PARA MAIS DETALHES");
            System.out.println(e);
        }
    }
}
