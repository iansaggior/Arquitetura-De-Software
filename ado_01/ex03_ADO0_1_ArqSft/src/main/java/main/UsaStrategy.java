/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

/**
 *
 * @author iansa
 */
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import strategy.*;

public class UsaStrategy {

    public static void main(String[] args) {
        try {
            int qtdVetor = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que o seu vetor irá ter:"));
            int[] vetor = new int[qtdVetor];
            
            int entreNum = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Digite qual o limite dos numeros a serem gerados (ex: entre 0-100):"
                                    + "\n\n****OBS: NÃO PODE SER MENOR QUE O TAMNHO DO VETOR****"));
            
            //GERAR NUMEROS ALEATORIOS NAO REPETIDOS
            Random random = new Random();

            for (int i = 0; i < qtdVetor; i++) {
                int numeroAleatorio;
                boolean numeroRepetido;
                do {
                    numeroAleatorio = random.nextInt(entreNum);
                    numeroRepetido = false;
                    for (int j = 0; j < i; j++) {
                        if (vetor[j] == numeroAleatorio) {
                            numeroRepetido = true;
                            break;
                        }
                    }
                } while (numeroRepetido);
                vetor[i] = numeroAleatorio;
            }

            String[] options = {
                "BUBBLE SORT",
                "INSERTION SORT",
                "SELECTION SORT",
                "SAIR"
            }; 
            int option = JOptionPane.showOptionDialog(null, null, "Escolha uma opção",
                    JOptionPane.INFORMATION_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (option > 2) {
                System.err.println("SAINDO...");
            } else {
                System.out.println("Vetor antes da ordenação: ");
                System.out.println(Arrays.toString(vetor) + "\n");

                MetodoOrdenacao mtdOrd = Ordenacao.values()[option].escolher();
                mtdOrd.metodoOrdenacao(vetor);
                System.out.println(Arrays.toString(vetor));
            }

        } catch (Exception e) {
            System.err.println("DEU ALGUMA XAROPADA AI, CONSULTE O FORNECEDOR DO CODIGO PARA MAIS DETALHES");
            System.out.println(e);
        }
    }
}
