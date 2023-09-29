/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author iansa
 */
public class Selection implements MetodoOrdenacao {
    @Override
    public void metodoOrdenacao(int[] v) {
        int i, j, min, aux;
        int cont = 0;
        for (i = 0; i < v.length - 1; i++) {
            min = i;
            for (j = i + 1; j < v.length; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            aux = v[i];
            v[i] = v[min];
            v[min] = aux;
            cont++;
        }
        System.out.println("Usanso o método de ordenação Selection Sort");
//        System.out.println("Quantidade de vezes que ouve uma troca de posição: " + cont);
    }
}
