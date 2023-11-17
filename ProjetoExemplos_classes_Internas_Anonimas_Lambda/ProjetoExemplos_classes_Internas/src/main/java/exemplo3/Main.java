/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo3;

/**
 *
 * @author ian.spereira
 */
public class Main {
    public static void main(String[] args) {
        NomeCompleto nomeComp = new NomeCompleto() {
            @Override
            public String getNome() {
                return "Ian Saggioratto Pereira";
            }
        };
        nomeComp.exibir(nomeComp.getNome());
    }
    
}
