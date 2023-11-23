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
        // simulando ações que vão seguir uma regra que acordo com o caminho dado, sendo elas avançar para a  
        // ação requisitada ou dizer se já está na ação desejada/ não é possivel "voltar" para essa ação
        tarefa.requisitarAtrasada();
        tarefa.requisitarConcluida();
        tarefa.requisitarConcluida();
        tarefa.requisitarPendente();
        tarefa.requisitarConcluida();
        tarefa.requisitarAtrasada();
    }
}
