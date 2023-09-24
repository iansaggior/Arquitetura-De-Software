/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author iansa
 */
public class IPTO2 implements CalcOrcam {
    @Override
    public double calcularOrcamento(double orcamento) {
        return orcamento * 1.15; // equivalente a valor total do orçamento + (15% * valor total do orçamento)
    }
}
