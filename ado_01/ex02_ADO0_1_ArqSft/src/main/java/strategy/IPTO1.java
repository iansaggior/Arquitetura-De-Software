/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author iansa
 */
public class IPTO1 implements CalcOrcam {

    @Override
    public double calcularOrcamento(double orcamento) {
        System.out.print("Valor do Orçamento com o imposto IPTO01 = ");
        return orcamento * 1.10; // equivalente a valor total do orçamento + (10% * valor total do orçamento)
    }

}
