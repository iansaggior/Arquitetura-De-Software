/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exemplo4;

/**
 *
 * @author ian.spereira
 */
@FunctionalInterface
public interface NomeCompleto {
    // somente um metodo abstrado
    public String getNome();
    
    default void exibir(String nome) {
        System.out.println(nome.replace(" ", "\n"));
    }
    
    // mais de um metodo default
    default void exibir_02(String nome) {
        System.out.println(nome.replace(" ", "\n"));
    }
    
}
