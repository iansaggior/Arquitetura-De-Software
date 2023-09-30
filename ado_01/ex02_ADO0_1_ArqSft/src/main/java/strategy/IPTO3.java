/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author iansa
 */
public class IPTO3 implements CalcOrcam {
    @Override
    public double calcularOrcamento(double orcamento) {
        System.out.print("Valor do Orçamento com o imposto IPTO03 = ");
        return orcamento * 1.25; // equivalente a valor total do orçamento + (25% * valor total do orçamento)
    }
}
