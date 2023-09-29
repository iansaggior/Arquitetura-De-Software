/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author iansa
 */
public class Insertion implements MetodoOrdenacao {
    @Override
    public void metodoOrdenacao(int[] v) {
        int i, j;
        int temp;
        int cont = 0;
        for (i = 1; i < v.length; i++) {
            temp = v[i];
            j = i;
            while (j > 0 && v[j - 1] >= temp) {
                v[j] = v[j - 1];
                j--;
            }
            cont++;
            v[j] = temp;
        }
        System.out.println("Usanso o método de ordenação Insertion Sort");
//        System.out.println("Quantidade de vezes que ouve uma troca de posição: " + cont);
    }
}
