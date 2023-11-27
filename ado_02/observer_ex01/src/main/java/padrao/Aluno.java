/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;
import java.util.*;

// concret subject

/**
 *
 * @author Ian
 */
public class Aluno implements Subject {

    private String nome;
    private double p1;
    private double p2;
    private double media;
    private List<Observer> lista = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
        calcularMedia();
        notificar();
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
        calcularMedia();
        notificar();        
    }

    private void calcularMedia() {
        this.media = (this.p1 + this.p2) / 2;
    }
    
    public double getMedia() {
        return media;
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.p1 = 0;
        this.p2 = 0;
        this.media = 0;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + ", media=" + media + '}';
    }

    @Override
    public void addObsvd(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void notificar() {
        for (Observer observer : lista) {
            observer.atualizar(this);
        }
    }

}
