/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author iansa
 */
public class Bubble implements MetodoOrdenação {
    @Override
    public void metodoOrdenacao(int[] v) {
        int i, j;
        int temp;
        int cont = 0;
        for (j = 0; j < v.length - 1; j++) {
            for (i = 0; i < v.length - 1 - j; i++) {
                if (v[i] > v[i + 1]) {
                    temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de vezes que ouve uma troca de posição: " + cont);
    }

}
