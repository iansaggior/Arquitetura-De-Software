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
public class Concluida implements Estados{
    private String mensagem = "Concluida";
    private Tarefa tarefa;
    
    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public Concluida(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
    @Override
    public void atrasar() {
        System.out.println("Já está concluida");
    }

    @Override
    public void concluir() {
        System.out.println("Já está concluida");
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(tarefa));
    }

    @Override
    public String toString() {
        return "Concluida{" + "mensagem=" + mensagem + '}';
    }

    
}
