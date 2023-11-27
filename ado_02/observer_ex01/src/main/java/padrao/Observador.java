/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

// concret Observer
/**
 *
 * @author Ian
 */
public class Observador implements Observer {
    private String nome;

    public Observador(String nome, Subject subject) {
        this.nome = nome;
        subject.addObsvd(this);
    }

    @Override
    public void atualizar(Aluno aluno) {
        System.out.println("O " + nome + " visualizou as notas do");
        System.out.println(aluno);
        System.out.println("------------------------------");
    }
    
}
