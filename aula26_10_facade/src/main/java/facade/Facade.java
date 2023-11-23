/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author ian.spereira
 */

import subsistema.*;
public class Facade {
    // trecho responsavel por interligar as tres listas e imprimir um relatorio final
    public void gerarRelatorio() {
        Cliente cliente = new Cliente();
        Gerente gerente = new Gerente();
        Projeto projeto = new Projeto();
        
        System.out.println("Cliente: " + cliente.pesquisarClienteId(123));
        System.out.println("Gerente: " + gerente.pesquisarGerenteId(3));
        System.out.println("Projeto: " + projeto.pesquisarProjetoId(23));
    }
    
}
