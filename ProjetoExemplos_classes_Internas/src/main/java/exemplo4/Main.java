/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo4;

/**
 *
 * @author ian.spereira
 */
//usando lambda
public class Main {
    public static void main(String[] args) {
        
        NomeCompleto nome = () -> {
            return "Ian Saggioratto Pereira";
        };
        
        nome.exibir(nome.getNome());
    }
}
