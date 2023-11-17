/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

/**
 *
 * @author ian.spereira
 */
public class GerenciadorTarefas {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Fazer elicitação e requisitos");
        tarefa.requisitarAtrasada();
        tarefa.requisitarPendente();
        tarefa.requisitarConcluida();
    }
}
