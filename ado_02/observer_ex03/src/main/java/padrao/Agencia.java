/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

import java.util.*;

/**
 *
 * @author Ian
 */
public class Agencia implements Subject {
    private String nome;
    private Vaga vaga;
    private List<Observer> lista;

    public Agencia(String nome) {
        this.nome = nome;
        lista = new ArrayList<>();
    }

    @Override
    public void adcionarObvd(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void adcionarVaga(Vaga vaga) {
        this.vaga = vaga;
        notificar();
    }

    @Override
    public void notificar() {
        for (Observer obs : lista) {
            obs.atualizar(vaga);
        }
    } 
}
