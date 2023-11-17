/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import state.*;

/**
 *
 * @author ian.spereira
 */
public class Tarefa {
    private String descricao;
    private Estados estado;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.estado = new Pendente(this);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(estado);
    }
    
    protected void requisitarAtrasada() {
        estado.atrasar();
    }
    
    protected void requisitarConcluida() {
        estado.concluir();
    }
    
    protected void requisitarPendente() {
        estado.pendente();
    }
    
}
