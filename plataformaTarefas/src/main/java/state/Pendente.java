/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import cliente.*;

/**
 *
 * @author ian.spereira
 */
public class Pendente implements Estados {
    
    private String mensagem = "Pendente";
    private Tarefa tarefa;


    public Pendente(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluir() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já esta pendente!!  ");
    }

    @Override
    public String toString() {
        return "Pendente{" + "mensagem=" + mensagem + '}';
    }
    
}
