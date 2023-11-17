/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo2;

/**
 *
 * @author ian.spereira
 */
// 
public class Main {
    public static void main(String[] args) {
        Exibir exibir = new Exibir() {
            @Override
            public void exibirNome() {
                System.out.println("Exibir Nome");
            }
            @Override
            public void exibirSobreNome() {
                System.out.println("Exibir Sobrenome");
            }
        };
        exibir.exibirNome();
        exibir.exibirSobreNome();
    }
}
