/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.ex03_ado;

/**
 *
 * @author iansa
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
import strategy.*;

public class Ex03_ado {

    public static void main(String[] args) {
        try {
            int qtdVetor = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que o seu vetor irá ter:"));
            int[] vetor = new int[qtdVetor];

            for (int i = 0; i < qtdVetor; i++) {
                vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° valor do vetor: "));
            }

            String[] options = {
                "BUBBLE SORT",
                "INSERTION SORT",
                "SELECTION SORT",
                "SAIR"
            };

            int option = JOptionPane.showOptionDialog(null, null, "Escolha uma opção",
                    JOptionPane.INFORMATION_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            System.out.println("Vetor antes da ordenação: ");
            System.out.println(Arrays.toString(vetor) + "\n");

            MetodoOrdenacao mtdOrd = Ordenacao.values()[option].escolher();
            mtdOrd.metodoOrdenacao(vetor);
            System.out.println(Arrays.toString(vetor));

        } catch (Exception e) {
            System.err.println("DEU ALGUMA XAROPADA AI, CONSULTE O FORNECEDOR DO CODIGO PARA MAIS DETALHES");
            System.out.println(e);
        }
    }
}
