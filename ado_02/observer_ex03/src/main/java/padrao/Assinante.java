/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 *
 * @author Ian
 */
public class Assinante implements Observer {
    private String nome;

    public Assinante(String nome, Subject subject) {
        this.nome = nome;
        subject.adcionarObvd(this);
    }
    
    @Override
    public void atualizar(Vaga vaga) {
        System.out.println("O assinante " + nome + " visualizou a vaga: " + vaga);        
    }    

    
}
