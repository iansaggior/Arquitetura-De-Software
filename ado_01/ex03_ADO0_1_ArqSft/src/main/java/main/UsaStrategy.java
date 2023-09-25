/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

/**
 *
 * @author iansa
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
import strategy.*;

public class UsaStrategy {

    public static void main(String[] args) {
        int qtdVetor = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que o seu vetor irá ter:"));
        int[] vetor = new int[qtdVetor];

        for (int i = 0; i < qtdVetor; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° valor do vetor: "));
        }

        System.out.println("Vetor antes da ordenação: ");
        System.out.println(Arrays.toString(vetor));

        mtdBubble(vetor);
        mtdInsertion(vetor);
        mtdSelection(vetor);
    }

    /**
     * Metodo estatico que ordena e imprime o vetor atraves do Bubble Sort
     * @param vetor
     */
    public static void mtdBubble(int[] vetor) {
        MetodoOrdenação bubble = new Bubble();
        System.out.println("\nUsando método de ordenação Bubble Sort: ");
        bubble.metodoOrdenacao(vetor);
        System.out.println(Arrays.toString(vetor));
    }
    
    /**
     * Metodo estatico que ordena e imprime o vetor atraves do Insertion Sort
     * @param vetor
     */
    public static void mtdInsertion(int[] vetor) {
        MetodoOrdenação insertion = new Insertion();
        System.out.println("\nUsando método de ordenação Bubble Sort: ");
        insertion.metodoOrdenacao(vetor);
        System.out.println(Arrays.toString(vetor));
    }
    
    /**
     * Metodo estatico que ordena e imprime o vetor atraves do Selection Sort
     * @param vetor
     */
    public static void mtdSelection(int[] vetor) {
        MetodoOrdenação selection = new Selection();
        System.out.println("\nUsando método de ordenação Bubble Sort: ");
        selection.metodoOrdenacao(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
