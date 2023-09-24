/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author iansa
 */
public class Servico {
    private String nomeServico;
    private double valorServico;

    public Servico(String nomeServico, double valorServico) {
        this.nomeServico = nomeServico;
        this.valorServico = valorServico;
    }

    public Servico() {
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    @Override
    public String toString() {
        return "Nome do Servico: " + nomeServico + 
                "\nValor do Servico: " + valorServico + '\n';
    }
    
    
}
