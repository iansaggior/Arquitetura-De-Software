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
public class Atrasada implements Estados {
    
    private String mensagem = "Atrasada";
    private Tarefa tarefa;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Atrasada(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        System.out.println("Já esta atrasada");
    }

    @Override
    public void concluir() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já esta atrasada");
    }

    @Override
    public String toString() {
        return "Atrasada{" + "mensagem=" + mensagem + '}';
    }
    
    
}
